package com.dicoding.myapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.myapp.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvName.text = "Novira Hernawati"
        binding.tvEmail.text = "noviraa.h@students.amikom.ac.id"
    }
}
