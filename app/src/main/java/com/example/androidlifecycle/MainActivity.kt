package com.example.androidlifecycle

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var TAG="tag"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("TAG","onCreate Activity1 Called")
        val tv:TextView = findViewById(R.id.tv)
        tv.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }


    }



    override fun onPostResume() {
        super.onPostResume()
        Log.d(TAG,"onPostResume Activity1 Called")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart Activity1 Called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume Activity1 Called")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause Activity1 Called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop Activity1 Called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart Activity1 Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy Activity1 Called")
    }
}