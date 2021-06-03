package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var btn = findViewById<Button>(R.id.btn_1)
        var input = findViewById<EditText>(R.id.input_1)
        var output = findViewById<TextView>(R.id.txt_1)

        btn.setOnClickListener(View.OnClickListener{
            var n :Int = input.text.toString().toInt()
            var i :Int = 1
            var result:String = " "
                 while(i <= n)
            {
                result += (i).toString()+"@"
                ++i
            }

            output.setText("Result :$result")


        })


    }
}