package com.devhuba.kotlinbasics.EX

// Create loop that iterates each second numbers
// from 100 to 0

fun main() {
    var number = 10
    while (number >= 0) {
        if (number == 0) {
            print("$number\n")
        } else {
            print("$number, ")
        }
        number -= 2
    }
    for (iter in 10 downTo 1) {
        if (iter == 1) {
            print("iter -> ${iter}\n")
        } else {
            print("iter -> ${iter}, ")
        }
    }
}