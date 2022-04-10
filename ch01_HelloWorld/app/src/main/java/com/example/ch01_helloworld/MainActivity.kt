package com.example.ch01_helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    private val TAG = "!!!!";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun press_button(view: View) {

        val message = App().getMessage();

        println("$TAG App: $message");


        var x = 3;
        val name = "Cormoran";

        x *= 10;
        println("$TAG Do something: X is $x.");

        x = 30;
        while(x > 20) {
            x -= 1;
            println("$TAG x is now $x");
        }

        x = 0;
        for(i in 1..10) {
            x += 1;
            println("$TAG x is now $x");
        }

        if (x == 20) {
            println("$TAG x must be 20.");
        } else {
            println("$TAG x isn't 20.");
        }

        if (name == "Cormoran") {
            println("$name Strike");
        }

        x = 1;
        println("$TAG Before the loop. x = $x.");
        while(x < 4) {
            println("$TAG In the loop. x = $x.");
            x = x + 1;
        }
        println("$TAG After the loop. x = $x.");

        x = 3;
        var y = 1;

        println(if (x > y ) "$TAG $x is greater than $y." else "$TAG $x isn't greater than $y.");

        x = 1;
        while( x < 3 ) {
            print(if (x == 1) "Yab" else "Dab");
            print("ba");
            x += 1;
        }
        if (x == 3) println("Do");
    }
}