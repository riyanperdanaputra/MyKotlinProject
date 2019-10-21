package com.example.mykotlinproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nimEt=findViewById<EditText>(R.id.nimEt)
        val namaEt=findViewById<EditText>(R.id.namaEt)
        val nilaiEt=findViewById<EditText>(R.id.nilaiEt)

        val btn_save=findViewById<Button>(R.id.btn_save)

        btn_save.setOnClickListener {
            val nim=nimEt.text.toString()
            val nama=namaEt.text.toString()
            val nilai=nilaiEt.text.toString()

            val intent = Intent(this@MainActivity, Proses::class.java)

            intent.putExtra("Nim",nim)
            intent.putExtra("Nama",nama)
            intent.putExtra("Nilai",nilai)

            startActivity(intent)

        }
    }
}
