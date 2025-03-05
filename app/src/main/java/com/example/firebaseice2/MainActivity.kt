package com.example.firebaseice2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    private lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        auth = FirebaseAuth.getInstance()
        btnLogout = findViewById(R.id.btnLogout) // Updated button ID

        // Logout button functionality
        btnLogout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, Login::class.java))
            finish() // Close MainActivity after logging out
        }
    }
}
