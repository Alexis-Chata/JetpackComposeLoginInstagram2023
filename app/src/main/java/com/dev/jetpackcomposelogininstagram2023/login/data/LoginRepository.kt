package com.dev.jetpackcomposelogininstagram2023.login.data

import com.dev.jetpackcomposelogininstagram2023.login.data.network.LoginService
import javax.inject.Inject

class LoginRepository  @Inject constructor(private val api:LoginService) {

    suspend fun doLogin(user:String, password:String):Boolean{
        return api.doLogin(user, password)
    }
}