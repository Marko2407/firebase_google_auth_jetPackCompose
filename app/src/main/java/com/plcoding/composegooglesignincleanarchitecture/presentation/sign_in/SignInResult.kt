package com.plcoding.composegooglesignincleanarchitecture.presentation.sign_in

data class SignInResult(
    val data: UserData?,
    val errorMsg: String? = null
)

data class UserData(
    val userId: String,
    val userName: String?,
    val profilePicture: String?
)