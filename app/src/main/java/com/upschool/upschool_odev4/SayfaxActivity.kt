package com.upschool.upschool_odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SayfaxActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfax)
        val button5:Button=findViewById(R.id.button5)
        button5.setOnClickListener { //SAYFA Y YE GİDER
            val intent= Intent(this@SayfaxActivity,SayfayActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}