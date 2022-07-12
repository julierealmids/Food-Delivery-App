package dev.nakayiza.foodater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.nakayiza.foodater.databinding.ActivityMenuBinding

class Menu : AppCompatActivity() {
    lateinit var binding:ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}