package com.example.bookmarket

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // 시작하기 버튼의 android:onClick="onStartClick" 에서 호출됨
    fun onStartClick(v: View?) {
        Toast.makeText(applicationContext, "도서 쇼핑몰을 시작합니다", Toast.LENGTH_SHORT).show()
    }
}