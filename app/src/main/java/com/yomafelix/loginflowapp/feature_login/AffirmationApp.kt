package com.yomafelix.loginflowapp.feature_login

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.yomafelix.loginflowapp.feature_login.navigation.AffirmationAppRouter
import com.yomafelix.loginflowapp.feature_login.navigation.Screen
import com.yomafelix.loginflowapp.feature_login.screens.login.LoginScreen
import com.yomafelix.loginflowapp.feature_login.screens.sign_up.SignUpScreen
import com.yomafelix.loginflowapp.feature_login.screens.terms_and_condition.TermsAndConditionScreen

@Composable
fun AffirmationApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = AffirmationAppRouter.currentScreen) { currentState ->
            when(currentState.value){
                is Screen.SignUpScreen ->{
                    SignUpScreen()
                }
                is Screen.TermsAndConditionScreen ->{
                    TermsAndConditionScreen()
                }
                is Screen.LoginScreen ->{
                    LoginScreen()
                }
            }

        }
    }
}