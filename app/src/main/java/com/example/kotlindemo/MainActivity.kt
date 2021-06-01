package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var butn = findViewById<Button>(R.id.btn)
        var txt = findViewById<TextView>(R.id.txt)
        var input_result = findViewById<EditText>(R.id.input)

        var flag=false;
        butn.setOnClickListener(View.OnClickListener{
            var radius : Double = input_result.text.toString().toDouble()
            val pi=3.141
            var area :Double= pi*radius*radius

            txt.setText("Result : $area")
        })

    }
}