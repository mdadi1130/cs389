package com.mdadi.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        // Get msg param from intent
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        // Set textview text val to msg from intent
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
