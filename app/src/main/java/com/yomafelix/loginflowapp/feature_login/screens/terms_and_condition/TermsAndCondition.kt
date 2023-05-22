package com.yomafelix.loginflowapp.feature_login.screens.terms_and_condition

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yomafelix.loginflowapp.R
import com.yomafelix.loginflowapp.feature_login.components.HeaderTextComponent
import com.yomafelix.loginflowapp.feature_login.navigation.AffirmationAppRouter
import com.yomafelix.loginflowapp.feature_login.navigation.Screen
import com.yomafelix.loginflowapp.feature_login.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionScreen() {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(16.dp)
    ) {
        HeaderTextComponent(text = stringResource(id = R.string.terms_and_condition_header))
    }

    SystemBackButtonHandler {
        AffirmationAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun defaultPreviewTermsAndCondition() = TermsAndConditionScreen()