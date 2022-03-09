package com.devhuba.kotlinbasics

fun main() {
    val fruits = setOf<String>(
        "Apple",
        "Grape",
        "Orange",
        "Apple",
        "Apple"
    )
    //Will ignore repeated values in set
//    println(fruits.size)
    //Sort values alphabetically
//    println(fruits.toSortedSet())
    val newFruits = fruits.toMutableList()
    newFruits.add("Water Melon")
    newFruits.add("Pear")
    println(newFruits)
    //Show element in set with index 3
//    println(newFruits.elementAt(3))

    val daysOfTheWeek = mapOf(
        1 to "Monday",
        2 to "Tuesday",
        3 to "Wednesday"
    )
    // RETURNS OBJECT (key,value) !!!
    // -> {1=Monday, 2=Tuesday, 3=Wednesday}
//    println(daysOfTheWeek)
    //Return value from specified key (not index)
    // -> Tuesday
//    println(daysOfTheWeek[2])
    // -> Monday Tuesday Wednesday
    for (item in daysOfTheWeek.values) {
        println(item)
    }
    // -> 1 2 3
    for (item in daysOfTheWeek.keys) {
        println(item)
    }
    // -> 1=Monday 2=Tuesday 3=Wednesday
    for (item in daysOfTheWeek.entries) {
        println(item)
    }
    //Add new items into map
    val newDayOfWeek = daysOfTheWeek.toMutableMap()
    newDayOfWeek[4] = "Thursday"
    newDayOfWeek[5] = "Friday"

    println(newDayOfWeek.toSortedMap())

    val fruitsMap = mapOf(
        "Not good" to FruitForMap("Grape", 2.3),
        "OK" to Fruit("Apple", 3.2)
    )


}

data class FruitForMap(
    val name: String,
    val price: Double
)