package com.android.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    lateinit var output : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        output = findViewById(R.id.textView)

        var userName : String = intent.getStringExtra("username").toString()
        var userAge : Int = intent.getIntExtra("userAge", 0)

        "Your name is $userName and your age is $userAge".also { output.text = it }
    }
}