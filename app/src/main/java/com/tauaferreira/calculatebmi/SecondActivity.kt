package com.tauaferreira.calculatebmi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent = intent;
        val name = intent.getStringExtra("EXTRA_NAME")
        val password = intent.getStringExtra("EXTRA_PASSWORD")

        val mTextViewResult : TextView = findViewById(R.id.textViewResult)

        mTextViewResult.setText("$name a sua senha é $password")
    }
}