package com.example.zad8

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun b4(view: View) {
        var intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun b5(view: View) {
        var intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }
}