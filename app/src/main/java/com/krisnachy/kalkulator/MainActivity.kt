package com.krisnachy.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative_layout)
        val edtxnilai1 = findViewById<EditText>(R.id.edtxNilai1)
        val edtxnilai2 = findViewById<EditText>(R.id.edtxNilai2)
        val btnKali = findViewById<ImageButton>(R.id.btnKali)
        val btnTambah = findViewById<ImageButton>(R.id.btnTambah)
        val btnKurang = findViewById<ImageButton>(R.id.btnKurang)
        val btnBagi = findViewById<ImageButton>(R.id.btnBagi)
        val textMenampilakanNilai = findViewById<TextView>(R.id.textMenampilakanNilai)


        btnTambah.setOnClickListener {
            textMenampilakanNilai.text = tambah(edtxnilai1.text.toString().toInt(), edtxnilai2.text.toString().toInt()).toString()
        }

        btnKurang.setOnClickListener {
            textMenampilakanNilai.text = kurang(edtxnilai1.text.toString().toInt(), edtxnilai2.text.toString().toInt()).toString()
        }

        btnKali.setOnClickListener {
            textMenampilakanNilai.text = kali(edtxnilai1.text.toString().toInt(), edtxnilai2.text.toString().toInt()).toString()
        }

        btnBagi.setOnClickListener {
            textMenampilakanNilai.text = bagi(edtxnilai1.text.toString().toInt(), edtxnilai2.text.toString().toInt()).toString()
        }

    }

    private fun tambah(value1 : Int, value2 : Int) : Int {
        return value1 + value2
    }

    private fun kurang(value1: Int, value2: Int) : Int {
        return value1 - value2
    }

    private fun kali(value1: Int, value2: Int) : Int {
        return value1 * value2
    }

    private fun bagi(value1: Int, value2: Int) : Int {
        return value1 / value2
    }

}