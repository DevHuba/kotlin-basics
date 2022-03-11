package com.devhuba.kotlinbasics.ex

import java.util.zip.DeflaterOutputStream

fun main() {
    val numbers: ArrayList<Double> = ArrayList()
    numbers.add(1.0)
    numbers.add(2.5)
    numbers.add(3.7)
    numbers.add(5.8)
    numbers.add(7.2)

    //Required choice
    var total = 0.0
    for (i in numbers) {
        total += i
    }

    val result = average(numbers)
    println(result)


}

//Easy way
fun average(array: ArrayList<Double>): Double{
    val sum = array.sum()
    return sum / array.size
}