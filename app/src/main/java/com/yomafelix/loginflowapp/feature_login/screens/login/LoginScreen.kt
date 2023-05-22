package com.yomafelix.loginflowapp.feature_login.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yomafelix.loginflowapp.R
import com.yomafelix.loginflowapp.feature_login.components.ButtonComponent
import com.yomafelix.loginflowapp.feature_login.components.ClickableLoginRegisterTextComponent
import com.yomafelix.loginflowapp.feature_login.components.CustomTextField
import com.yomafelix.loginflowapp.feature_login.components.DividerTextComponent
import com.yomafelix.loginflowapp.feature_login.components.HeaderTextComponent
import com.yomafelix.loginflowapp.feature_login.components.PasswordTextField
import com.yomafelix.loginflowapp.feature_login.components.PlainTextComponent
import com.yomafelix.loginflowapp.feature_login.components.UnderlinePlainTextComponent
import com.yomafelix.loginflowapp.feature_login.navigation.AffirmationAppRouter
import com.yomafelix.loginflowapp.feature_login.navigation.Screen
import com.yomafelix.loginflowapp.feature_login.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen() {

    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            PlainTextComponent(text = stringResource(id = R.string.login))

            HeaderTextComponent(text = stringResource(id = R.string.welcome))
            Spacer(modifier = Modifier.height(20.dp))

            CustomTextField(
                labelText = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_email)
            )

            PasswordTextField(
                labelText = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password)
            )
            Spacer(modifier = Modifier.height(20.dp))

            UnderlinePlainTextComponent(text = stringResource(id = R.string.forgot_password))

            Spacer(modifier = Modifier.height(80.dp))
            ButtonComponent(text = stringResource(id = R.string.login))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()

            ClickableLoginRegisterTextComponent(tryingToLogin = false, onTextSelected = {
                AffirmationAppRouter.navigateTo(Screen.SignUpScreen)
            })

        }

    }
    SystemBackButtonHandler {
        AffirmationAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() = LoginScreen()