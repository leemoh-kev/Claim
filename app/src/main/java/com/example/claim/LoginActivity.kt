package com.example.claim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var BtnSignup :TextView
    lateinit var Btnlogin :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        BtnSignup=findViewById(R.id.textviewSignup)
        Btnlogin=findViewById(R.id.btnlogin)

        BtnSignup.setOnClickListener {
            val signup=Intent(this,RegisterActivity::class.java)
            startActivity(signup)
        }

    }
}
