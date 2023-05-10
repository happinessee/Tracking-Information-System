package com.example.trackinginfosystem.signinsignup

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SignInViewModel(private val userRepository: UserRepository) : ViewModel() {
    fun signIn(
        id: String,
        pw: String,
        onSignInComplete: () -> Unit,
    ) {
        userRepository.signIn(id, pw)
        onSignInComplete()
    }
}

class SignInViewModelFactory : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(SignInViewModel::class.java)) {
            return SignInViewModel(UserRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}