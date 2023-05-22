package com.yomafelix.loginflowapp.feature_login.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen(){
    object SignUpScreen: Screen()
    object TermsAndConditionScreen:Screen()
    object LoginScreen: Screen()
}

object AffirmationAppRouter{
    var currentScreen: MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination: Screen){
        currentScreen.value = destination
    }
}
