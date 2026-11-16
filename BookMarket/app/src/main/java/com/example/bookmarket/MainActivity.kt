package com.example.bookmarket

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        var myAge = 20
        myAge = 25
        Log.d("코틀린 : 가변 변수 var", "나의 나이는 " + myAge)

        val myName = "홍길동"
        Log.d("코틀린 : 불변 변수 val", "나의 이름은 " + myName)

        var numTwo = 3000000000
        var myByte: Byte = 1
        var myLong = 25L
        Log.d("코틀린 : 정수 자료형", "Long : " + numTwo)
        Log.d("코틀린 : 정수 자료형", "Byte : " + myByte)
        Log.d("코틀린 : 정수 자료형", "Long : " + myLong)

        var myFloat = 30.2F
        var myDouble = 35.4
        Log.d("코틀린 : 실수 자료형", "Float : " + myFloat)
        Log.d("코틀린 : 실수 자료형", "Double : " + myDouble)

        var myBoolean: Boolean = true
        Log.d("코틀린 : 부울린 자료형", "Boolean : " + myBoolean)

        var myChar1: Char = 'K'
        var myChar2: Char = 'o'
        var myChar3: Char = 't'
        var myChar4: Char = 'l'
        var myChar5: Char = 'i'
        var myChar6: Char = 'n'
        Log.d("코틀린 : 문자 자료형", "Char : " + myChar1 + myChar2 + myChar3 + myChar4 + myChar5 + myChar6)

        var myString1: String = "Kotlin\n"
        Log.d("코틀린 : 문자열 자료형", "String : " + myString1)

        var myArray: IntArray = intArrayOf(1, 2, 3, 4, 5)
        Log.d("코틀린 : 배열 자료형", "배열의 3번째 값: " + myArray[2])


        var myX: Int = 100
        var myY: Long = myX.toLong()
        Log.d("코틀린 : 자료형 변환", "Long : " + myY)


        var x: Int = 4
        var y: Int = 2
        Log.d("코틀린 : 산술 연산자", "x + y = " + (x + y))
        Log.d("코틀린 : 산술 연산자", "x - y = " + (x - y))
        Log.d("코틀린 : 산술 연산자", "x / y = " + (x / y))
        Log.d("코틀린 : 산술 연산자", "x * y = " + (x * y))
        Log.d("코틀린 : 산술 연산자", "x % y = " + (x % y))

        Log.d("코틀린 : 비교 연산자", "x > y = " + (x > y))
        Log.d("코틀린 : 비교 연산자", "x < y = " + (x < y))
        Log.d("코틀린 : 비교 연산자", "x >= y = " + (x >= y))
        Log.d("코틀린 : 비교 연산자", "x <= y = " + (x <= y))
        Log.d("코틀린 : 비교 연산자", "x == y = " + (x == y))
        Log.d("코틀린 : 비교 연산자", "x != y = " + (x != y))

        var a: Int = 10
        a += x
        Log.d("코틀린 : 할당 연산자", "a += x => a = " + a)
        a -= x
        Log.d("코틀린 : 할당 연산자", "a -= x => a = " + a)
        a *= x
        Log.d("코틀린 : 할당 연산자", "a *= x => a = " + a)
        a /= x
        Log.d("코틀린 : 할당 연산자", "a /= x => a = " + a)
        a %= x
        Log.d("코틀린 : 할당 연산자", "a %= x => a = " + a)

        var z: Int = 1
        Log.d("코틀린 : 증감 연산자", "++z = " + (++z))
        Log.d("코틀린 : 증감 연산자", "--z = " + (--z))

        var p: Boolean = true
        var q: Boolean = false
        Log.d("코틀린 : 논리 연산자", "p && q = " + (p && q))
        Log.d("코틀린 : 논리 연산자", "p || q = " + (p || q))
        Log.d("코틀린 : 논리 연산자", "!q = " + (!q))


        var num: Int = -10
        var result: String
        if (num > 0) {
            if (num % 2 == 0) {
                result = "숫자 " + num + "은 양수이고 짝수"
            } else {
                result = "숫자 " + num + "은 양수이고 홀수"
            }
        } else if (num == 0) {
            result = "숫자 " + num + "은 0"
        } else {
            if (num % 2 == 0) {
                result = "숫자 " + num + "은 음수이고 짝수"
            } else {
                result = "숫자 " + num + "은 음수이고 홀수"
            }
        }
        Log.d("코틀린 : if 조건문", result)

        var day: Int = 2
        var dayName: String
        when (day) {
            1 -> dayName = "Monday"
            2 -> dayName = "Tuesday"
            3 -> dayName = "Wednesday"
            4 -> dayName = "Thursday"
            5 -> dayName = "Friday"
            6 -> dayName = "Saturday"
            7 -> dayName = "Sunday"
            else -> dayName = "Invalid day"
        }
        Log.d("코틀린 : when 조건문", dayName)


        for (i in 1..5) {
            Log.d("코틀린 : for 반복문", "반복변수 : " + i)
        }
        for (i in 5 downTo 1 step 2) {
            Log.d("코틀린 : for 반복문", "반복변수 : " + i)
        }

        var numbers = arrayOf(1, 2, 3, 4, 5)
        for (i in numbers.indices) {
            Log.d("코틀린 : for 반복문", "반복변수 : " + numbers[i])
        }

        var k = 0
        while (k <= 5) {
            Log.d("코틀린 : while 반복문", "반복순번 : " + k)
            k++
        }

        var num1 = 3
        var num2 = 5
        var mulResult = mul(num1, num2)
        Log.d("코틀린 : 사용자 정의 함수", "$num1 * $num2 = $mulResult")
        var mulResult2 = mul(num1)
        Log.d("코틀린 : 사용자 정의 함수", "$num1 * 5 = $mulResult2")
        var mulResult3 = mul(a = 3, b = 5)
        Log.d("코틀린 : 사용자 정의 함수", "3 * 5 = $mulResult3")


        var myObj = Member()
        myObj.name = "홍길동"
        myObj.age = 20
        myObj.gender = 'M'
        myObj.printMemberInfo()

        var myEmp = Employee(202201, "홍길순")
        var myPerson = Person("홍길순", 20)

        val myAnimal = Animal()
        val myDog = Dog()
        Log.d("코틀린 : 객체 지향 프로그래밍", "Animal 클래스: ${myAnimal.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog.sound()}")

        val myDog2 = Dog2()
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog2.sound()}")
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog2.sleep()}")

        val myDog3 = Dog3()
        Log.d("코틀린 : 객체 지향 프로그래밍", "Dog 클래스: ${myDog3.sound()}")


        val myDog4 = Dog4()
        myDog4.printNames()
        myDog4.callSoundMethods()


        val person = PersonData("홍길순", 30)
        println(person)


        val lists = listOf("월요일", "화요일", "수요일", "목요일", "금요일")
        val sets = setOf(1, 2, 2, 3, 3, 3, "Java", "Kotlin")
        val maps = mapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")
        Log.d("코틀린 : 컬렉션", "불변 리스트: $lists")
        Log.d("코틀린 : 컬렉션", "첫 번째 요일: ${lists[0]}")
        Log.d("코틀린 : 컬렉션", "불변 셋 : $sets")
        Log.d("코틀린 : 컬렉션", "셋에 'Java' 포함 여부: ${"Java" in sets}")
        Log.d("코틀린 : 컬렉션", "불변 맵 : $maps")
        Log.d("코틀린 : 컬렉션", "맵에서 key 2에 해당하는 값: ${maps[2]}")

        val mLists = mutableListOf("월요일", "화요일", "수요일", "목요일", "금요일")
        val mSets = mutableSetOf(6, 10)
        val mMaps = mutableMapOf(1 to "Java", 2 to "Kotlin", 3 to "Android")
        Log.d("코틀린 : 컬렉션", "초기 리스트: $mLists")
        Log.d("코틀린 : 컬렉션", "초기 셋: $mSets")
        Log.d("코틀린 : 컬렉션", "초기 맵 : $mMaps")
        mLists[0] = "일요일"
        mLists.add("토요일")
        mSets.add(2)
        mSets.add(5)
        mMaps[1] = "C#"
        mMaps[4] = "C++"
        Log.d("코틀린 : 컬렉션", "변경된 리스트: $mLists")
        Log.d("코틀린 : 컬렉션", "변경된 셋: $mSets")
        Log.d("코틀린 : 컬렉션", "변경된 맵 : $mMaps")


        var nullableName: String? = "John"
        nullableName = null
        val nameLength = nullableName?.length ?: 0
        Log.d("코틀린 : 널 처리", "이름 길이: $nameLength")


        val letName: String? = "Kotlin"
        letName?.let {
            println("이름의 길이는 ${it.length}입니다.")
        }

        val runName: String? = "Hello, Kotlin"
        val messageLength = runName?.run {
            println("이름은 $this 입니다.")
            length
        }
        println("길이: $messageLength")

        val withResult = with(StringBuilder()) {
            append("Hello, ")
            append("Kotlin!")
            toString()
        }
        println(withResult)

        val student = Student().apply {
            name = "John"
            age = 25
        }
        println(student.name)

        val number = mutableListOf(1, 2, 3).also {
            println("리스트의 크기: ${it.size}")
            it.add(4)
        }
        println(number)
    }


    fun mul(a: Int, b: Int = 5): Int {
        var number = a * b
        return number
    }
}


data class PersonData(val name: String, val age: Int)

class Student {
    var name: String = ""
    var age: Int = 0
}
