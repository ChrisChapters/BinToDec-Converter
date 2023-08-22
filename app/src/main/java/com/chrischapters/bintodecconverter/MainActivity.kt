package com.chrischapters.bintodecconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.title = getString(R.string.app_name)


        val input = findViewById<EditText>(R.id.E1)
        val button = findViewById<Button>(R.id.B1)
        val output = findViewById<TextView>(R.id.T1)


        button.setOnClickListener {
            val inputtext = input.text.toString()
            val result = convertBinaryToDecimal(inputtext)
            output.text="Decimal Number Is : $result"


        }
    }
    private fun convertBinaryToDecimal(binary: String):Int{
        return try{
            Integer.parseInt(binary,2)
        }catch (e:NumberFormatException){
            val context = this
            Toast.makeText(context,"Please Enter a Binary Number",Toast.LENGTH_SHORT).show()
            -1
        }
    }
}