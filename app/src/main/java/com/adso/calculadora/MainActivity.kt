package com.adso.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.adso.calculadora.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.buttonClear.setOnClickListener(this)
        binding.buttonDivide.setOnClickListener(this)
        binding.buttonMultiply.setOnClickListener(this)
        binding.buttonBack.setOnClickListener(this)
        binding.buttonPlus.setOnClickListener(this)
        binding.buttonMinus.setOnClickListener(this)
        binding.button1.setOnClickListener(this)
        binding.button2.setOnClickListener(this)
        binding.button3.setOnClickListener(this)
        binding.button4.setOnClickListener(this)
        binding.button5.setOnClickListener(this)
        binding.button6.setOnClickListener(this)
        binding.button7.setOnClickListener(this)
        binding.button8.setOnClickListener(this)
        binding.button9.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view) {
            binding.buttonClear -> clear()
            binding.buttonDivide -> append("/")
            binding.buttonMultiply -> append("*")
            binding.buttonBack -> back()
            binding.buttonPlus -> append("+")
            binding.buttonMinus -> append("-")
            binding.button1 -> append("1")
            binding.button2 -> append("2")
            binding.button3 -> append("3")
            binding.button4 -> append("4")
            binding.button5 -> append("5")
            binding.button6 -> append("6")
            binding.button7 -> append("7")
            binding.button8 -> append("8")
            binding.button9 -> append("9")
        }
    }

    private fun append(value: String) {
        val currentValue = binding.textView.text.toString()
        binding.textView.text = currentValue + value
    }

    private fun clear() {
        binding.textView.text = ""
    }

    private fun back() {
        val currentValue = binding.textView.text.toString()
        if (currentValue.isNotEmpty()) {
            binding.textView.text = currentValue.substring(0, currentValue.length - 1)
        }
    }
}
