package com.journaldev.maproutebetweenmarkers.repository

import android.net.Uri
import com.google.firebase.auth.FirebaseUser

interface AuthRepository {
    suspend fun signUpUser(userName: String,email: String, password: String, imageUri: Uri) : Result<FirebaseUser>
    suspend fun loginUser(email: String, password: String) : Result<FirebaseUser>
}