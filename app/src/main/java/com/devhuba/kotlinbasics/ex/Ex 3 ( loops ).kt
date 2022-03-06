package com.devhuba.kotlinbasics.ex

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
    for (num in 0..10) {
        if (num == 8) {
            println("IT`S OVER 7!!!")
        }
    }
    var humidityLevel = 80
    var humidity = "humid"
    while (humidity == "humid") {
        humidityLevel -= 5
        println("humidity decreased and must be $humidityLevel")
        if (humidityLevel == 60) {
            println("it`s comfy now")
            humidity = "comfy"
        }
    }
    var z = 12
    do {
        print("$z ")
    } while(z <= 10)

}