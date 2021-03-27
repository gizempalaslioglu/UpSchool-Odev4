package com.upschool.upschool_odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SayfabActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfab)

        val button4:Button=findViewById(R.id.button4)
        button4.setOnClickListener { //SAYFA Y YE GİDER
            val intent= Intent(this@SayfabActivity,SayfayActivity::class.java)
            finish()
            startActivity(intent)
        }
    }
}