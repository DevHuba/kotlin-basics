package com.devhuba.kotlinbasics

fun main() {
    val months = listOf("January", "February", "March")
    val anyTypes = listOf(1, 2, 3, true, false, "Text")
//    print(anyTypes)
//    println(anyTypes.size)
//    print(months[2])

    for (month in months) {
        println(month)
    }

    //Add array into another list
    //Make month array mutable
    val additionalMonths = months.toMutableList()
    //Create array with items for add
    val newMonths = arrayOf(
        "April",
        "May",
        "June",
        "July",
        "August",
        "September",
        "October",
        "November",
        "December",
    )
    //Add new items into mutable list
    additionalMonths.addAll(newMonths)
//    print("$additionalMonths")
    //Change special month in list
    additionalMonths[4] = "Missing month"
//    println(additionalMonths)

    val days =
        mutableListOf<String>("Month", "Tue", "Wed")
    days.add("Thu")
    days.removeAt(0)
    println(days)
    //Remove special items group from list
    val removeFromList =
        mutableListOf<String>("Month", "Wed")
    days.removeAll(removeFromList)
    //Remove all from list
//    days.removeAll(days)
    println(days)
}