package com.example.bookmarket

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

// 책 5장 방식: 액티비티가 View.OnClickListener 를 구현해서 클릭 이벤트를 한 곳에서 처리
class MainActivity : AppCompatActivity(), View.OnClickListener {

    // 변수 선언하기
    lateinit var book1: ImageView
    lateinit var book2: ImageView
    lateinit var book3: ImageView
    lateinit var book4: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 위젯 id 가져오기
        book1 = findViewById(R.id.imgBook1)
        book2 = findViewById(R.id.imgBook2)
        book3 = findViewById(R.id.imgBook3)
        book4 = findViewById(R.id.imgBook4)

        // 이벤트 리스너 등록하기
        book1.setOnClickListener(this)
        book2.setOnClickListener(this)
        book3.setOnClickListener(this)
        book4.setOnClickListener(this)
    }

    // 이벤트 처리하기
    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.imgBook1 -> showTitle("쉽게 배우는 알고리즘")
            R.id.imgBook2 -> showTitle("난생처음 MySQL")
            R.id.imgBook3 -> showTitle("쉽게 배우는 PHP 웹 프로그래밍")
            R.id.imgBook4 -> showTitle("미라클 HTML5+CSS3+자바스크립트")
        }
    }

    private fun showTitle(title: String) {
        Toast.makeText(applicationContext, title, Toast.LENGTH_SHORT).show()
    }
}