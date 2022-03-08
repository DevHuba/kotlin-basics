package com.devhuba.kotlinbasics

fun main() {
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "Text")
//    print(anyTypes)
//    println(anyTypes.size)
//    print(months[2])
    
    for (month in months) {
        print("${month}, ")
    }

    //Add array into another array
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("April", "May", "June")
    additionalMonths.addAll(newMonths)
    print("$additionalMonths")
    
}