package com.devhuba.kotlinbasics

fun main() {

    //While example 1
    var i = 1
    while (i <= 5) {
        if (i == 5) {
            print("While loop $i \n")
        } else {
            print("While loop $i ")
        }
        i++
    }

    //While example 2
    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold") {
        roomTemp++
        if (roomTemp >= 20) {
            feltTemp = "comfy"
            println("it`s comfy now")
        }
    }

    //For loops
    for (iter in 1..3) {
        print("a -> ${iter} || ")
    }

    for (iter2 in 1 until 3) {//Same as -
        // for(iter2 in 1.until(3))
        print("b -> ${iter2} // ")
    }

    for (iter3 in 6 downTo 0 step 2) { //Same as -
        // for(iter3 in 6.downTo(1).step(2)
        print("c -> ${iter3} ")
    }

    //Do while loop
    var x = 15
    do {
        print("x -> $x ")
        x--
    } while (x > 10)
}