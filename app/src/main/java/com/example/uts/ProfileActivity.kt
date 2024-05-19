package com.example.uts

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvName = findViewById<TextView>(R.id.textViewName)
        val tvNim = findViewById<TextView>(R.id.textViewNim)
        val tvKelas = findViewById<TextView>(R.id.textViewClass)
        val tvEmail = findViewById<TextView>(R.id.textViewEmail)

        val sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
        val name = sharedPreferences.getString("name", "N/A")
        val nim = sharedPreferences.getString("nim", "N/A")
        val kelas = sharedPreferences.getString("kelas", "N/A")
        val email = sharedPreferences.getString("email", "N/A")

        tvName.text = "Name: $name"
        tvNim.text = "NIM: $nim"
        tvKelas.text = "Kelas: $kelas"
        tvEmail.text = "Email: $email"
    }
}