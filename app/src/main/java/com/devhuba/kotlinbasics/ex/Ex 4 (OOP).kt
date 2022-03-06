package com.devhuba.kotlinbasics.ex

fun main() {
    val mobile1 = MobilePhone("Android", "Nokia", "3210")
    val mobile2 = MobilePhone("iOS", "Apple", "iPhone11")
    val mobile3 = MobilePhone("Android", "Motorola", "MOTO378")
}

class MobilePhone(osName: String, brand: String, model: String) {
    init {
        println("Details : $osName, $brand, $model")
    }
}