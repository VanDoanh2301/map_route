package com.journaldev.maproutebetweenmarkers.di



import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.journaldev.maproutebetweenmarkers.repository.AuthRepository
import com.journaldev.maproutebetweenmarkers.repository.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object FirebaseModule {
    @Provides
    fun provideFirebaseAuth(): FirebaseAuth = FirebaseAuth.getInstance()

    @Provides
    fun provideFirebaseDatabase(): FirebaseDatabase = FirebaseDatabase.getInstance()

    @Provides
    fun provideFirebaseStorage(): FirebaseStorage = FirebaseStorage.getInstance()

    @Provides
    fun provideAuthRepository(firebaseAuth: FirebaseAuth, firebaseStorage: FirebaseStorage, firebaseDatabase: FirebaseDatabase): AuthRepository {
        return AuthRepositoryImpl(firebaseAuth, firebaseStorage, firebaseDatabase)
    }
}