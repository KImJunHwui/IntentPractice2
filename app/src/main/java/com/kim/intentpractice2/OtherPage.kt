package com.kim.intentpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other_page.*

class OtherPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other_page)

        val ReceiveMassage = intent.getStringExtra("welcome")
        welcomeTxt.text = ReceiveMassage

    }
}