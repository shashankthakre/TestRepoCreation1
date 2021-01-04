package com.example.kotlinfunctionalpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.kotlinfunctionalpractice.R

class NuulableExample : AppCompatActivity() {


    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nuulable_example)

        textView=findViewById(R.id.textView)


        textView?.setOnClickListener {

            Toast.makeText(this,"?.",Toast.LENGTH_LONG).show()
        }

    }
}