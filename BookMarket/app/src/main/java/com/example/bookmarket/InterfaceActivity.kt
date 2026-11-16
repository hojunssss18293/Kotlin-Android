package com.example.bookmarket

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class InterfaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myDog = Dog2()

        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog.sleep()}")
    }
}

interface Animal2 {
    fun sound(): String          // 구현되지 않은 메서드
    fun sleep(): String {        // 디폴트 구현 제공
        return "잠을 잔다"
    }
}

class Dog2 : Animal2 {
    override fun sound(): String {
        return "멍멍"
    }
}