package com.dicoding.asclepius.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.net.toUri
import com.dicoding.asclepius.R
import com.dicoding.asclepius.databinding.ActivityMainBinding
import com.dicoding.asclepius.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.extras?.getString(MainActivity.IMAGE_CLASS).toString()
        val label = intent.extras?.getString(MainActivity.LABEL).toString()
        val score = intent.extras?.getString(MainActivity.SCORE).toString()

        binding.resultImage.setImageURI(image.toUri())
        binding.resultLabel.text = "Klasifikasi: ${label}"
        binding.resultScore.text = "Nilai Klasifikasi: ${score}"

    }


}