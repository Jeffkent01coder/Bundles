package com.jeff.bundles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jeff.bundles.databinding.ActivityMain2Binding

class Read : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val info = intent.getSerializableExtra("New_Data")as Person

        binding.tvName.text = info.toString()

    }
}