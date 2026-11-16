package com.example.bookmarket

import android.util.Log

class Member {
    var name: String = ""
    var age: Int = 0
    var gender: Char = 'M'

    fun printMemberInfo() {
        Log.d("코틀린 : 객체지향프로그래밍", "Member 이름 : $name")
        Log.d("코틀린 : 객체지향프로그래밍", "Member 나이 : $age")
        Log.d("코틀린 : 객체지향프로그래밍", "Member 성별 : $gender")
    }
}