package com.example.bookmarket

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class InheritanceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myAnimal = Animal()
        val myDog = Dog()

        Log.d("코틀린 : 객체 지향 프로그래밍", "Animal 클래스: ${myAnimal.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog.sound()}")
    }
}

// 상속할 클래스에 open 추가
open class Animal {
    open fun sound(): String {
        return "동물이 소리를 낸다"
    }
}

// 상속받기
class Dog : Animal() {
    override fun sound(): String {   // 부모 클래스의 함수를 재정의
        return "멍멍"
    }
}