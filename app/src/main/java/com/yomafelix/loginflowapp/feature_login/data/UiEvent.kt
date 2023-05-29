package com.yomafelix.loginflowapp.feature_login.data

sealed class UiEvent{
    data class FirstNameChange(val firstName: String): UiEvent()
    data class LastNameChange(val lastName: String): UiEvent()
    data class EmailChange(val email: String): UiEvent()
    data class PasswordChange(val password: String): UiEvent()
}
