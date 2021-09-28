package com.example.wjdan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var name: EditText
        lateinit var location: EditText
        lateinit var mobil: EditText
        lateinit var toa: Button
        lateinit var Tv: Button
        lateinit var go: Button
        lateinit var view: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.Name)
        location = findViewById(R.id.Location)
        mobil = findViewById(R.id.Mobil)
        toa = findViewById(R.id.toa)
        Tv = findViewById(R.id.tv)
        go = findViewById(R.id.go)
        view = findViewById(R.id.textView)

        toa.setOnClickListener{
            val str = "${name.text.toString() +" " + location.text.toString()+" "+ mobil.text.toString()}"

            Toast.makeText(applicationContext, str,Toast.LENGTH_SHORT).show()
        }

        Tv.setOnClickListener{
            val str = "${name.text.toString()+"\n" + location.text.toString()+"\n" + mobil.text.toString()}"

            view.text= str
        }
        go.setOnClickListener{
            val str = "${name.text.toString()+"\n" + location.text.toString()+"\n" + mobil.text.toString()}"

            val intent = Intent(this ,MainActivity2::class.java)
            intent.putExtra("send",str)
            startActivity(intent)

        }

    }
}