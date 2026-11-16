package com.example.bookmarket

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity



class SuperThisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myDog = Dog4()
        myDog.printNames()
        myDog.callSoundMethods()
    }
}

open class Animal4 {
    open val name: String = "동물"

    open fun sound(): String {
        return "동물 소리"
    }

    constructor() {
        Log.d("코틀린 : 객체지향프로그래밍", "Animal4 생성자 호출")
    }
}

class Dog4 : Animal4 {
    override val name: String = "강아지"

    override fun sound(): String {
        return "멍멍!"
    }

    fun printNames() {
        Log.d("코틀린 : 객체지향프로그래밍", "this.name = ${this.name}")
        Log.d("코틀린 : 객체지향프로그래밍", "super.name = ${super.name}")
    }

    fun callSoundMethods() {
        Log.d("코틀린 : 객체지향프로그래밍", "this.sound() 호출 결과: ${this.sound()}")
        Log.d("코틀린 : 객체지향프로그래밍", "super.sound() 호출 결과: ${super.sound()}")
    }

    constructor() : super() {
        Log.d("코틀린 : 객체지향프로그래밍", "Dog 생성자 호출")
    }
}