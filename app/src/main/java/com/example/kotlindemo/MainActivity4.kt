package com.example.kotlindemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        fun result(a :Float , b :Float ,o : String ): String {
            return (when (o) {
                "+" ->  (a + b).toString()
                "-" ->  (a - b).toString()
                "*" ->  (a * b).toString()
                "/" ->  (a / b).toString()
                else -> "invalid"
            })
        }

        var txt1 = findViewById<EditText>(R.id.int_1)
        var txt2 = findViewById<EditText>(R.id.int_2)
        var spinner = findViewById<Spinner>(R.id.spinner2)
        var btn = findViewById<Button>(R.id.btn_4)
        var output = findViewById<TextView>(R.id.output_4)

        btn.setOnClickListener(View.OnClickListener {
            var operator :String = spinner.selectedItem.toString()
            var a: Float = txt1.text.toString().toFloat()
            var b: Float = txt2.text.toString().toFloat()

            var c:String  = result(a,b,operator)
            output.setText("Result : $c")
        })
    }
}