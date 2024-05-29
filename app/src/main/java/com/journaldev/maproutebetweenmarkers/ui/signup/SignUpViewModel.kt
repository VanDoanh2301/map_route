package com.journaldev.maproutebetweenmarkers.ui.signup

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.storage.StorageReference
import com.journaldev.maproutebetweenmarkers.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(private val authRepository: AuthRepository) : ViewModel() {
    private val _signUpResult = MutableLiveData<Result<FirebaseUser>>()
    val signUpResult: LiveData<Result<FirebaseUser>> get() = _signUpResult

    fun signUp(userName: String,email: String, password: String, imageUri: Uri) {
        viewModelScope.launch {
            val result = authRepository.signUpUser(userName ,email, password, imageUri)
            _signUpResult.postValue(result)
        }
    }
}