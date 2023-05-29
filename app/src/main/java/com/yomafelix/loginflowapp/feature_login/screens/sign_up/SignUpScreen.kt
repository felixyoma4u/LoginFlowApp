package com.yomafelix.loginflowapp.feature_login.screens.sign_up

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
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yomafelix.loginflowapp.R
import com.yomafelix.loginflowapp.feature_login.components.ButtonComponent
import com.yomafelix.loginflowapp.feature_login.components.CheckBoxComponent
import com.yomafelix.loginflowapp.feature_login.components.ClickableLoginRegisterTextComponent
import com.yomafelix.loginflowapp.feature_login.components.CustomTextField
import com.yomafelix.loginflowapp.feature_login.components.DividerTextComponent
import com.yomafelix.loginflowapp.feature_login.components.HeaderTextComponent
import com.yomafelix.loginflowapp.feature_login.components.PasswordTextField
import com.yomafelix.loginflowapp.feature_login.components.PlainTextComponent
import com.yomafelix.loginflowapp.feature_login.data.LoginScreenVM
import com.yomafelix.loginflowapp.feature_login.data.UiEvent
import com.yomafelix.loginflowapp.feature_login.navigation.AffirmationAppRouter
import com.yomafelix.loginflowapp.feature_login.navigation.Screen

@Composable
fun SignUpScreen(
loginScreenVM: LoginScreenVM = viewModel()
) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp),
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            PlainTextComponent(text = stringResource(id = R.string.hello))
            HeaderTextComponent(text = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(20.dp))

            CustomTextField(
                labelText = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.ic_profile),
                onTextSelected = {
                    loginScreenVM.onEvent(UiEvent.FirstNameChange(it))
                }
            )
            CustomTextField(
                labelText = stringResource(id = R.string.last_name),
                painterResource = painterResource(id = R.drawable.ic_profile),
                onTextSelected = {
                    loginScreenVM.onEvent(UiEvent.LastNameChange(it))
                }
            )
            CustomTextField(
                labelText = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_email),
                onTextSelected = {
                    loginScreenVM.onEvent(UiEvent.EmailChange(it))
                }
            )

            PasswordTextField(
                labelText = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.password),
                onTextSelected = {
                    loginScreenVM.onEvent(UiEvent.PasswordChange(it))
                }
            )

            CheckBoxComponent(
                text = stringResource(id = R.string.terms_and_conditions),
                onTextSelected = {
                    AffirmationAppRouter.navigateTo(Screen.TermsAndConditionScreen)
                }
            )

            Spacer(modifier = Modifier.height(40.dp))
            ButtonComponent(text = stringResource(id = R.string.register))
            Spacer(modifier = Modifier.height(20.dp))
            DividerTextComponent()
            
            ClickableLoginRegisterTextComponent(tryingToLogin = true, onTextSelected = {
                AffirmationAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }

}

@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}