package com.pesh.arithmetics.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pesh.arithmetics.databinding.ActivityMainBinding
import com.pesh.arithmetics.util.Arithmetic

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var number1: String
    private lateinit var number2: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.btnAdd.setOnClickListener {
            calculate("add")

        }
        binding.btnSubtract.setOnClickListener {
            calculate("subtract")
        }

        binding.btnMultiply.setOnClickListener {
            calculate("multiply")

        }

        binding.btnDivision.setOnClickListener {
            calculate("division")

        }
    }

    private fun calculate(string: String) {
        number1 = binding.numbOne.text.toString()
        number2 = binding.numbTwo.text.toString()

        if (number1.isNotEmpty() && number2.isNotEmpty()) {
            val doubleNumber1 = number1.toDouble()
            val doubleNumber2 = number2.toDouble()
            val arithmetic = Arithmetic(doubleNumber1, doubleNumber2)
            var answer = 0.0
            when (string) {

                "add" -> {

                    binding.arithmetic.text = " + "
                    answer = arithmetic.add()
                }
                "subtract" -> {

                    binding.arithmetic.text = " - "
                    answer= arithmetic.subtract()
                }
                "multiply" -> {
                    binding.arithmetic.text = " * "
                    answer = arithmetic.multiply()                }
                "division" -> {
                    binding.arithmetic.text = " / "
                    answer = arithmetic.divide()
                }

            }

            binding.labelAnswer.text = answer.toString()


        } else {
            Toast.makeText(baseContext, "all fields required", Toast.LENGTH_SHORT).show()
        }


    }


}