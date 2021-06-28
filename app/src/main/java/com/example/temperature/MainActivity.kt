package com.example.temperature

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var Cel : EditText = findViewById(R.id.etCelcius)

        var Fah : TextView = findViewById(R.id.tvF)

        val convert : Button =findViewById(R.id.btnConvert)

        val reset : Button = findViewById(R.id.btnReset)

        convert.setOnClickListener{

            var c = Cel.text.toString().toDouble()
            var ch = (c * 9/5 ) + 32


          Fah.text = ch.toString()

        }

        reset.setOnClickListener{

            Cel.setText("")
            Fah.setText("")

        }


    }
}