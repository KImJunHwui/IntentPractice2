package com.kim.intentpractice2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moveToOtherBtn.setOnClickListener {

            val inputMassage = welcomeEdt.text.toString()
            val myIntent = Intent(this, OtherPage::class.java)
            myIntent.putExtra("welcome",inputMassage)
            startActivity(myIntent)

        }

    }
}