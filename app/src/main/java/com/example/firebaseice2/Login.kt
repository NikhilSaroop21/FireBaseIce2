package com.example.firebaseice2

import android.content.Intent
import android.os.Bundle
import android.webkit.WebView.FindListener
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {

    private lateinit var BTN3:Button
    private lateinit var BTN4:Button
    private lateinit var ETN1:EditText
    private lateinit var ETN2:EditText





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets










        }

        BTN3 =findViewById(R.id.btnLogin)
        BTN4= findViewById(R.id.btnReg)
        ETN1= findViewById(R.id.email)
        ETN2= findViewById(R.id.Password)

        BTN4.setOnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        }


}









    }
