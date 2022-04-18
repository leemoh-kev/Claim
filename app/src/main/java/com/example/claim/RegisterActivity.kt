package com.example.claim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class RegisterActivity : AppCompatActivity() {
    lateinit var BtnAccount :TextView
    lateinit var Btnreg :Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        BtnAccount=findViewById(R.id.AlreadyHaveAccount)
        Btnreg=findViewById(R.id.btnRegister)

        BtnAccount.setOnClickListener {
            val haveAct=Intent(this,LoginActivity::class.java)
            startActivity(haveAct)
        }
    }
}