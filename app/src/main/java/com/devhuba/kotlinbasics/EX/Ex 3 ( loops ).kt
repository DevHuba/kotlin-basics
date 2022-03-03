package com.devhuba.kotlinbasics.EX

// Create loop that iterates each second numbers
// from 100 to 0

fun main() {
    var number = 100
    while (number >= 0) {
        println(number)
        number -= 2
    }
}