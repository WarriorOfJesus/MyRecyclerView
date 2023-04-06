package com.example.myrecyclerview

import android.app.Application
import com.example.myrecyclerview.model.UsersListener
import com.example.myrecyclerview.model.UsersService

class App : Application() {

    val usersService = UsersService()

}