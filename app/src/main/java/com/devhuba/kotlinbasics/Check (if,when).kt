package com.devhuba.kotlinbasics

fun main() {
    val heightPerson1 = 170
    val heightPerson2 = 189

    if (heightPerson1 > heightPerson2){
        println("use raw force")
    }else if(heightPerson2 == heightPerson1){
        println("use technique")
    }else{
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
}