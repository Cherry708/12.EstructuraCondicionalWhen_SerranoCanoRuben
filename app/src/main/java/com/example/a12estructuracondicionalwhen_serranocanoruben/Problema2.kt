package com.example.a12estructuracondicionalwhen_serranocanoruben

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val etFirstGrade = findViewById<EditText>(R.id.etFirstGrade)
        val etSecondGrade = findViewById<EditText>(R.id.etSecondGrade)
        val etThirdGrade = findViewById<EditText>(R.id.etThirdGrade)
        val btnCalculateAverage = findViewById<Button>(R.id.btnCalculateAverage)


        var average = 0.0
        var result = ""
        btnCalculateAverage.setOnClickListener {
            val firstGrade = etFirstGrade.text.toString()
            val secondGrade = etSecondGrade.text.toString()
            val thirdGrade = etThirdGrade.text.toString()
            if (firstGrade.isNotEmpty() && secondGrade.isNotEmpty() && thirdGrade.isNotEmpty()){
                val firstGradeDouble = etFirstGrade.text.toString().toDouble()
                val secondGradeDouble = etSecondGrade.text.toString().toDouble()
                val thirdGradeDouble = etThirdGrade.text.toString().toDouble()
                average = (firstGradeDouble+secondGradeDouble+thirdGradeDouble)/3
            }
            when{
                average >= 7 -> result = "Promocionado."
                average >= 4 -> result = "Regular."
                else -> result = "Libre."
            }
            Toast.makeText(this,result,Toast.LENGTH_LONG).show()
        }
    }
}