package com.example.a4symbolmath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.parse.ParseObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //code provided by back4app to test the apps connectivity to the parse sdk and the test was successful
/*                val firstObject = ParseObject("FirstClass")
                firstObject.put("message","Hey ! First message from android. Parse is now connected")
                firstObject.saveInBackground {
                    if (it != null){
                        it.localizedMessage?.let { message -> Log.e("MainActivity", message) }
                    }else{
                        Log.d("MainActivity","Object saved.")
                    }
                }*/
            }
        }


