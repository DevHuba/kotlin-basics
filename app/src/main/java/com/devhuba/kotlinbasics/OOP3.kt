package com.devhuba.kotlinbasics

//Super class, Parent class, Base class
open class Vehicles {
    //props
    //methods
}

//Sub, Child, Derived class of Vehicle class
//Super class, Parent class, Base class for ElectricCars
open class Cars(val name: String, val brand: String) {
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if (amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove for $distance KM")
    }


}

//Sub, Child, Derived class of Car class
class ElectricCars(
    name: String, brand: String,
    batteryLife: Double
) : Cars(name, brand) {
    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drove for $distance KM on electricity")
    }
    fun drive () {
        println("Drove for $range KM on electricity")
    }
}

fun main() {
    val audiA3 = Cars("A3", "Audi")
    val teslaS = ElectricCars(
        "S-Model",
        "Tesla", 85.0
    )
    teslaS.extendRange(200.0)



    teslaS.drive()

    //Polymorphism
    audiA3.drive(200.0)
    teslaS.drive(200.0)


}