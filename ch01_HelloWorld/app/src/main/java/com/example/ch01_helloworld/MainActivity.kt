package com.example.ch01_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private var TAG = "!!!!";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun press_button(view: View) {

        var app = App();

        System.out.println(TAG + "App: " + app.getMessage());
    }
}