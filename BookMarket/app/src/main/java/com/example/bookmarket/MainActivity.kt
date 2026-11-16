package com.example.bookmarket

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // 결과보기 버튼의 android:onClick="onResultClick" 에서 호출됨
    fun onResultClick(v: View?) {
        val etTurtle = findViewById<EditText>(R.id.etTurtle)
        val etFish = findViewById<EditText>(R.id.etFish)

        // 거북이는 2마리, 물고기는 5마리
        if (etTurtle.text.toString() == "2" && etFish.text.toString() == "5") {
            Toast.makeText(applicationContext, "맞았습니다", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "틀렸습니다", Toast.LENGTH_SHORT).show()
        }
    }
}