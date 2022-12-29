package com.example.sortowania_algo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val elementy = findViewById<TextView>(R.id.elements).toString().toInt()
        val start = findViewById<Button>(R.id.start)


        //Types
        val szybkie = findViewById<TextView>(R.id.sort1_result)
        val wstawianie = findViewById<TextView>(R.id.sort1_result2)
        val babelkowe = findViewById<TextView>(R.id.sort1_result3)
        val scalanie = findViewById<TextView>(R.id.sort1_result5)
        val heapsort = findViewById<TextView>(R.id.sort1_result6)

        start.setOnClickListener{
            val numbers = listOf<Int>(elementy)
            szybkie.text = numbers.toString()
        }

    }
}
