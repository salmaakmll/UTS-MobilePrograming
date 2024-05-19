package com.example.uts

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TambahData : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tambah_data)

        val isiNIM = findViewById<EditText>(R.id.isiNim)
        val isiNamaA = findViewById<EditText>(R.id.isiNamaA)
        val isiTempat= findViewById<EditText>(R.id.isiTempat)
        val isiTanggal = findViewById<EditText>(R.id.isiTanggal)
        val isiAlamat = findViewById<EditText>(R.id.isiAlamat)
        val isiAgama = findViewById<EditText>(R.id.isiAgama)
        val isiTelp = findViewById<EditText>(R.id.isiTelp)
        val isiTahunM= findViewById<EditText>(R.id.isiTahunM)
        val isiTahunl = findViewById<EditText>(R.id.isiTahunl)
        val isiPekerjaan = findViewById<EditText>(R.id.isiPekerjaan)
        val isiJabatan = findViewById<EditText>(R.id.isiJabatan)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)

        btnSimpan.setOnClickListener {
            val NIM = isiNIM.text.toString()
            val NamaA = isiNamaA.text.toString()
            val Tempat = isiTempat.text.toString()
            val Tanggal = isiTanggal.text.toString()
            val Alamat = isiAlamat.text.toString()
            val Agama = isiAgama.text.toString()
            val Telp = isiTelp.text.toString()
            val TahunM = isiTahunM.text.toString()
            val Tahunl = isiTahunl.text.toString()
            val Pekerjaan = isiPekerjaan.text.toString()
            val Jabatan = isiJabatan.text.toString()

            if (NIM.isNotEmpty() && NamaA.isNotEmpty() && Tempat.isNotEmpty() && Tanggal.isNotEmpty() && Alamat.isNotEmpty() && Agama.isNotEmpty() && Telp.isNotEmpty() && TahunM.isNotEmpty() && Tahunl.isNotEmpty() && Pekerjaan.isNotEmpty() && Jabatan.isNotEmpty()) {
                val sharedPreferences = getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
                val editor = sharedPreferences.edit()
                editor.putString("nim", NIM)
                editor.putString("nama", NamaA)
                editor.putString("tempat", Tempat)
                editor.putString("tanggal", Tanggal)
                editor.putString("Alamat", Alamat)
                editor.putString("Agama", Agama)
                editor.putString("Tlp", Telp)
                editor.putString("TahunM", TahunM)
                editor.putString("Tahunl", Tahunl)
                editor.putString("Pekerjaan", Pekerjaan)
                editor.putString("Jabatan", Jabatan)
                editor.apply()

                Toast.makeText(this, "Saved Successfully!", Toast.LENGTH_SHORT).show()
                finish()  // Close this activity and return to login
            } else {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}