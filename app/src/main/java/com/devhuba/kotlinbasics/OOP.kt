package com.devhuba.kotlinbasics

import java.lang.IllegalArgumentException

fun main() {
    //Person Example
    val person1 = Person("Aleks", "Huba")
    person1.hobby = "swimming"
    person1.stateHobby()
    var person2 = Person()
    var person3 = Person(firstName = "Bazilik")

    //Car Example
    val myCar = Car()
    println("Mr.${myCar.owner} bought our new ${myCar.carBrand} \"${myCar
        .carModel}\" this car max speed is ${myCar.maxSpeed}")

}

class Person(firstName: String = "John", lastName: String = "Doe") {
    private var age: Int? = null
    var hobby: String = "Netflix"
    private var firstName : String? = null

    init {
        this.firstName = firstName
        println("Person : $firstName $lastName")
    }

    constructor(
        firstName: String,
        lastName: String,
        age: Int
    ) : this(lastName) {
        this.age = age
        this.firstName = firstName
    }

    fun stateHobby() {
        println("$firstName hobby is $hobby")
    }
}

class Car(){
    lateinit var owner:String
    lateinit var carModel:String
    val carBrand: String = "BMW"
    //Custom getter
    get() {
        return  field.lowercase()
    }
    var maxSpeed: Int = -5
    set(value) {
        field = if (value > 0) value else throw IllegalArgumentException("Max speed can`t be less than 0")
    }
    init {
        this.owner = "Frank"
        this.carModel = "M3"
    }

}

class Person6 constructor(_firstName: String, _lastName: String) { // or
    // class Person constructor    (_firstName: String, _lastName: String)
    // Member Variables (Properties) of the class
    var firstName: String
    var lastName: String

    // Initializer Block
    init {
        this.firstName = _firstName
        this.lastName = _lastName

        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// create an object like so:
// val denis = Person("Denis", "Panjuta")

// Alternatively:
class Person5 (_firstName: String, _lastName: String) {
    // Member Variables (Properties) of the class
    var firstName: String = _firstName
    var lastName: String = _lastName

    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Alternatively:
class Person4(var firstName: String, var lastName: String) {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Or even:
// whereby John and Doe will be default values
class Person1(var firstName: String = "John", var lastName: String= "Doe") {
    // Initializer Block
    init {
        println("Initialized a new Person object with firstName = $firstName and lastName = $lastName")
    }
}

// Create an object:
/*
    val john = Person()
    val johnPeterson = Person(lastname: "Peterson")

*/

class Person2(var firstName: String, var lastName: String) {
    var age: Int? = null
    var hobby: String = "Watch Netflix"
    var myFirstName = firstName

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    fun stateHobby(){
        val firstname = this.firstName
        println("$firstname \'s Hobby is: $hobby'" )
    }
}

// You can use primary or secondary Constructor to create an object

// Calls the primary constructor (Age will be null in this case)
val person1 = Person("Denis", "Panjuta")

// Calls the secondary constructor
val person2 = Person("Elon", "Musk", 48)



// Having multiple overloads:

class Person3(var firstName: String, var lastName: String) {
    var age: Int? = null
    var eyeColor: String? = null

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName)  {
        this.age = if(age > 0) age else throw IllegalArgumentException("Age must be greater than zero")
    }

    // Secondary Constructor
    constructor(firstName: String, lastName: String, age: Int, eyeColor: String):
            this(firstName, lastName, age)  {
        this.eyeColor = eyeColor
    }
}


// SETTERS AND GETTERS

// User class with a Primary constructor that accepts
// three parameters
class Car1(_brand: String, _model: String, _maxSpeed: Int) {
    // Properties of User class
    val brand: String = _brand         // Immutable (Read only)
    var model: String = _model  // Mutable
    var maxSpeed: Int = _maxSpeed       // Mutable
}

// Kotlin internally generates a default getter and setter for mutable properties, and a getter (only) for read-only properties.

//It calls these getters and setters internally whenever
// you access or modify a property using the dot(.) notation.
//This is how it would look like internally
class Car2(_brand: String, _model: String, _maxSpeed: Int) {
    val brand: String = _brand
        get() = field

    var model: String = _model
        get() = field
        set(value) {
            field = value
        }

    var maxSpeed: Int = _maxSpeed
        get() = field
        set(value) {
            field = value
        }
}

// value
// We use value as the name of the setter parameter. This is the default convention in Kotlin but you’re free to use any other name if you want.
// The value parameter contains the value that a property is assigned to. For example, when you write user.name = "Elon Musk",
// the value parameter contains the assigned value "Elon Musk".

// 2. Backing Field (field)
// Backing field helps you refer to the property
// inside the getter and setter methods.
// This is required because if you use the property
// directly inside the getter or setter then you’ll
// run into a recursive call which will generate
// a StackOverflowError.


class Car3() {

    lateinit var owner : String

    val myBrand: String = "BMW"
        // Custom getter
        get() {
            return field.lowercase()
        }


    // default setter and getter
    var myModel: String = "M5"
        private set

    var myMaxSpeed: Int = 250
        get() = field
        // Custom Setter
        set(value) {
            field = if(value > 0) value else throw IllegalArgumentException("_maxSpeed must be greater than zero")
        }

    init{
        this.myModel = "M3"
        this.owner = "Frank"
    }
}

