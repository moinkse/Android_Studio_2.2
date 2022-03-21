package com.example.linear_layout_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // get reference to ImageView
        val iv_click_me = findViewById(R.id.star_image) as ImageView
        // set on-click listener
        iv_click_me.setOnClickListener {
            // your code to perform when the user clicks on the ImageView
            Toast.makeText(this@MainActivity, "Hello there", Toast.LENGTH_SHORT).show()
        }
    }
}