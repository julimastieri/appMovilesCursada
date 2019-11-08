package com.example.moviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_clase1.*


class Clase1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clase1)

        var countClick: Int = 0

        incrementButton.setOnClickListener {
            Toast.makeText(this@Clase1, "Sumaste uno", Toast.LENGTH_LONG).show()
            countClick++
            countTextView.text = countClick.toString()
        }

        resetButton.setOnClickListener {
            Toast.makeText(this@Clase1, "Reseteaste el contador", Toast.LENGTH_LONG).show()
            countClick = 0
            countTextView.text = countClick.toString()
        }


        incrementButton.setOnClickListener {
            Toast.makeText(this@Clase1, "Sumaste uno", Toast.LENGTH_LONG).show()
            countClick++
            countTextView.text = countClick.toString()
        }
    }
}
