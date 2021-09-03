package com.example.jacksonkotlinsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class MainActivity : AppCompatActivity() {
    private val tag = "Main"

    override fun onCreate(savedInstanceState: Bundle?) {
        try {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            val json =
                "{\"id\":1,\"username\":\"tom\",\"realname\":\"Mr.Brooks\",\"password\":\"000\"}"
            val userModel = jacksonObjectMapper().readValue(json) as UserModel
            Log.d(tag, userModel.toString())
        } catch (e: Exception) {
            Log.e(tag, e.toString())
        }
    }
}