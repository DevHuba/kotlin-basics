package com.devhuba.kotlinbasics.ex

fun main() {
    val mobile1 =
        MobilePhoneEx("Android", "Nokia", "3210", 10)
    val mobile2 =
        MobilePhoneEx("iOS", "Apple", "iPhone11", 20)
    val mobile3 =
        MobilePhoneEx("Android", "Motorola", "MOTO378", 30)

    mobile1.chargeBattery(30)
    mobile2.chargeBattery(30)
    mobile3.chargeBattery(30)
}

class MobilePhoneEx(
    osName: String, brand: String, model: String,
    private var battery: Int
) {

    fun chargeBattery(charge: Int) {
        val beforeCharge = battery
        val currentCharge = charge + beforeCharge
         return println(
            "Phone had before charge ${beforeCharge}%, was " +
                    "applied $charge%, and now phone has " +
                    "$currentCharge% charge"
        )
    }
}