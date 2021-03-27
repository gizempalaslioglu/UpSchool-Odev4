package com.upschool.upschool_odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button =findViewById(R.id.button)
        val button2:Button=findViewById(R.id.button2)

        button.setOnClickListener {//SAYFA A YA GİDER
        val intent=Intent(this@MainActivity,SayfaaActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener { //SAYFA X E GİDER
        val intent2=Intent(this@MainActivity,SayfaxActivity::class.java)
            startActivity(intent2)
        }
    }
}