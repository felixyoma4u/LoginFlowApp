package com.yomafelix.loginflowapp.feature_login.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.yomafelix.loginflowapp.feature_login.data.RegistrationUiState

class LoginScreenVM: ViewModel(){

    var registrationUiState = mutableStateOf(RegistrationUiState())

    fun onEvent(event: UiEvent){
        when(event){
            is UiEvent.FirstNameChange ->{
                registrationUiState.value = registrationUiState.value.copy(
                    firstName = event.firstName
                )
            }
            is UiEvent.LastNameChange ->{
                registrationUiState.value = registrationUiState.value.copy(
                    lastName = event.lastName
                )
            }
            is UiEvent.EmailChange ->{
                registrationUiState.value = registrationUiState.value.copy(
                    email = event.email
                )
            }
            is UiEvent.PasswordChange ->{
                registrationUiState.value = registrationUiState.value.copy(
                    password = event.password
                )
            }
        }
    }
}