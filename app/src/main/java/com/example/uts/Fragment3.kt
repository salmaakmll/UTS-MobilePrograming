package com.example.uts

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment3 : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment3, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val tvName = view.findViewById<TextView>(R.id.tvName)
        val tvNim = view.findViewById<TextView>(R.id.tvNim)
        val tvKelas = view.findViewById<TextView>(R.id.tvKelas)
        val tvEmail = view.findViewById<TextView>(R.id.tvEmail)

        val sharedPreferences = requireActivity().getSharedPreferences("UserPrefs", Context.MODE_PRIVATE)
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
