package com.devhuba.kotlinbasics

fun main() {
    val result1 = addUp(2, 5)
    println(result1)
    functionOne()

    val result2 = average(5.0,10.0,)
    println(result2)
}

//With parameters
fun addUp(a: Int, b: Int): Int {
    return a + b
}

fun functionOne() {
    println("Function One called")
}

// Ex Average
fun average(a: Double, b: Double): Double {
    val sum = a + b
    return sum / 2
}




