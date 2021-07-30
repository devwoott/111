package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import com.example.myapplication.databinding.ActivityRandomBinding
import java.util.*

class RandomActivity : AppCompatActivity() {
    lateinit var binding: ActivityRandomBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRandomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrayList = arrayListOf("개못생김", "다시태어나도못생김", "인간미로 승부", "잘생김")
        var random = Random()
        binding.button01.setOnClickListener {

            val num = random.nextInt(4)
            binding.textview01.text = arrayList.get(num)

        }
        binding.edittext01.addTextChangedListener{
        var edit01 = binding.edittext01.text.toString().toIntOrNull()
        var edit02 = binding.edittext02.text.toString().toIntOrNull()
        if(edit01 == null) {
            edit01=0
        }
        if(edit02 == null) {
            edit02=0
        }

            binding.result.setText((edit01+edit02).toString())


        }
        binding.edittext02.addTextChangedListener{
            var edit03 = binding.edittext01.text.toString().toIntOrNull()
            var edit04 = binding.edittext02.text.toString().toIntOrNull()
            if(edit03 == null) {
                edit03=0
            }
            if(edit04 == null) {
                edit04=0
            }

            binding.result.setText((edit03+edit04).toString())
        }
    }
}