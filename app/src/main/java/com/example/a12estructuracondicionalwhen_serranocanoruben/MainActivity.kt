package com.example.a12estructuracondicionalwhen_serranocanoruben

import android.net.wifi.p2p.WifiP2pManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etXPoint = findViewById<EditText>(R.id.etXPoint)
        val etYPoint = findViewById<EditText>(R.id.etYPoint)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        //DEBUGGER: Al empeza está vacío

        //Aún escribiendo siempre está empty, núnca recoge nada, excepto una vez. Inconsistente
        /*
        Solucionado, no había asignación en el evento y siempre permanecían vacios
        Esta estructura ha funcionado en el resto de Problemas de este tipo.
        */
        btnCalculate.setOnClickListener{
            val xPoint = etXPoint.text.toString()
            val yPoint = etYPoint.text.toString()
            if (xPoint.isNotEmpty() && yPoint.isNotEmpty()){
                val xPoint = etXPoint.text.toString().toInt()
                val yPoint = etYPoint.text.toString().toInt()
                Toast.makeText(this, calculateQuadrant(xPoint, yPoint), Toast.LENGTH_LONG).show()

            }
        }

    }
    private fun calculateQuadrant(xPoint:Int, yPoint:Int): String{
        var result = "Point is on axis"
        when{
            xPoint > 0 && yPoint > 0 -> result = "First quadrant."
            xPoint < 0 && yPoint > 0 -> result = "Second quadrant."
            xPoint < 0 && yPoint < 0 -> result = "Third quadrant"
            xPoint > 0 && yPoint < 0 -> result = "Fourth quadrant"
        }
        return result
    }

}

