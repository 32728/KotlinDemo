package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        fun result(day : String ): String {
            return (when (day) {
                "monday" -> "flakes"
                "tuesday" -> "pellets"
                "wednesday" -> "redworms"
                "thursday" -> "granules"
                "friday" -> "mosquitoes"
                "saturday" -> "lettuce"
                "sunday" -> "plankton"
                else -> "invalid"
            })
        }
        fun changeWater(t :Int ,d : Int ,day : String  ) : String  {
            if (t > 30) return "should change water "
            else if (d > 30) return "should change water "
            else if (day == "sunday ") return "should change water "
            else return "no need to change water "
        }
        var txt1 = findViewById<EditText>(R.id.temp)
        var txt2 = findViewById<EditText>(R.id.dirt)
        var spinner = findViewById<Spinner>(R.id.spinner5)
        var btn = findViewById<Button>(R.id.btn5)
        var output = findViewById<TextView>(R.id.o1)


        btn.setOnClickListener(View.OnClickListener {
            var day :String = spinner.selectedItem.toString()
            var t: Int = txt1.text.toString().toInt()
            var r: Int = txt2.text.toString().toInt()

            var o1 : String  = result(day)
            var o2 : String = changeWater(t,r,day)

            output.setText("Result : Food is $o1 \n" + o2 )
        })
    }
}