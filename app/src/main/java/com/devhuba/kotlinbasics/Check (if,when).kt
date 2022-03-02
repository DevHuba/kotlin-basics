package com.devhuba.kotlinbasics

fun main() {
    val heightPerson1 = 170
    val heightPerson2 = 189

    if (heightPerson1 > heightPerson2) {
        println("use raw force")
    } else if (heightPerson2 == heightPerson1) {
        println("use technique")
    } else {
        println("use both")
    }

    val age = 10
    when {
        age in 16..17 -> {
            println("You may ride a car !")
        }
        age in 18..20 -> {
            println("You may vote !")
        }
        age >= 21 -> {
            println("You may drink !")
        }
        else -> {
            println("You`r too young for all of that !!")
        }
    }

    val season = 3
    when (season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Invalid Season")
    }

    val month = 2
    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Summer")
        in 9..11 -> println("Fall")
        in 3 downTo 1 -> println("Winter")  // From 3 to 1 in opposite direction
        else -> println("Invalid Season")
    }
}