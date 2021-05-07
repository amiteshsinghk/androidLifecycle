package com.example.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {
    var TAG="tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
                Log.d(TAG ,"onCreate Activity2 Called")
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Activity2 Called")
//        finish()
    }
    override fun onPostResume() {
        super.onPostResume()
        Log.d(TAG,"onPostResume Activity2 Called")
    }
    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Activity2 Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Activity2 Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Activity2 Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Activity2 Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Activity2 Called")
    }
}