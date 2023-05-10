package com.example.trackinginfosystem.signinsignup

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun SignInRoute(
    id: String?,
    pw: String?,
    onSignInSubmitted: () -> Unit,
    onNavUp: () -> Unit,
) {
    val signInViewModel: SignInViewModel = viewModel(factory = SignInViewModelFactory())
    SignInScreen(
        id = id,
        onSignInSubmitted = { id, pw -> signInViewModel.signIn(id, pw, onSignInSubmitted) },
        onNavUp = onNavUp,
    )
}
