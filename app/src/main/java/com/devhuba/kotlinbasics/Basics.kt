package com.devhuba.kotlinbasics

fun main(){
    //immutable variable
    val myName = "Aleks"
    //mutable variable
    var age = 29
    println("My name is $myName and I`m $age years old")

    //Integer Types : Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 127
    val myShort: Short = 32767
    val myInt: Int = 2_147_483_647
    val myLong: Long = 9_223_372_036_854_775_807

    //Floating Point number Types : Float (32bit), Double (64bit)
    val myFloat: Float = 13.23F
    val myDouble: Double = 3.1415989734

    //Boolean Type : True , False
    val isTrue: Boolean = true
    val isFalse: Boolean = false

    //Characters
    val letterChar = 'A'
    val digitalChar = '$'

    //String - multiple characters
    val myStr = "Hello World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //Arithmetic operators (+ , - , * , / , %) + assignment operators + increment/decrement
    var result = 5 + 3
    result ++ // +1
    result -- // -1
    result /= 2
    result *= 5
    result += 3
    result -= 7
    //16 (15) / 3  16 - 15 = 1
    result %= 3
    println(result)
    
    //Comparison operations (==, !=, < , > , <=, >=)
    val isEqual = 5==3
    println("isEqual is $isEqual")

    val isNotEqual = 5 != 3
    println("isNotEqual is $isNotEqual")
    println("5 greater than 3 ?  Answer - ${5>3}")
    println("7 lower equal 3 ?  Answer - ${7<=3}")
    println("5 greater equal 5 ?  Answer - ${5>=5}")

}

