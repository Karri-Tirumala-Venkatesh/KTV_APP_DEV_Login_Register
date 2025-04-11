package com.example.labtask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login)

        val backToLoginBtn = findViewById<Button>(R.id.login_btn)
        val editText1 = findViewById<EditText>(R.id.username_input)
        val editText2 = findViewById<EditText>(R.id.password_input)
        backToLoginBtn.setOnClickListener {
            val input1 = editText1.text.toString().trim()
            val input2 = editText2.text.toString().trim()
            if (input1.isEmpty() || input2.isEmpty()) {
                Toast.makeText(this, "Please fill in both fields", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, RegisterActivity::class.java)
                startActivity(intent)
            }

        }
    }
}