package com.devhuba.kotlinbasics

fun main() {
//    val numbers:IntArray = intArrayOf(1,57,8,94,53)
//    val numbers = intArrayOf(1, 57, 8, 94, 53)
    val numbers = arrayOf(1, 2, 3, 4)
//    println(numbers.contentToString())
    for (element in numbers) {
        //Arithmetic methods in loop (do not modify the existed array)
        print("${element + 2}, ")
    }
//    print(numbers.contentToString())

    var increment = 6
//   VARIANT 1
//    for (element in numbers) {
//        numbers[count] = increment
//        print("${numbers[count]}, ")
//        count++
//        increment *= 2
//    }
//    print(numbers.contentToString())

//    VARIANT2
    for ((count) in numbers.withIndex()) {
        numbers[count] = increment
        print("${numbers[count]}, ")
        increment *= 2
    }
//    print(numbers.contentToString())

    val fruitsList = arrayOf(
        Fruit("Potato", 0.99),
        Fruit("Tomato", 0.87),
        Fruit("Apple", 1.2)
    )
    //VARIANT 1
    //printing specific field from objects Array
    for (index in fruitsList.indices) {
        print("${fruitsList[index].name} -> ind : $index, ")
    }
//    println(fruitsList.contentToString())

    //VARIANT 2
    //printing specific field from objects Array
    for (item in fruitsList) {
        print("${item.name}, ")
    }

}

data class Fruit(val name: String, val price: Double)