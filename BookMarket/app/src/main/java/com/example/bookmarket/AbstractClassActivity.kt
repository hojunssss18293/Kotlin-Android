package com.example.bookmarket

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class AbstractClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myDog = Dog3()

        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog.sound()}")
    }
}

abstract class Animal3 {
    abstract fun sound(): String
}

class Dog3 : Animal3() {
    override fun sound(): String {
        return "멍멍"
    }
}