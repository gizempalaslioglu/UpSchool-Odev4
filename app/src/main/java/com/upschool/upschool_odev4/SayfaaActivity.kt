package com.upschool.upschool_odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SayfaaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfaa)

        val button3:Button=findViewById(R.id.button3)
        button3.setOnClickListener { //SAYFA B YE GİDER
            val intent= Intent(this@SayfaaActivity,SayfabActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}