package com.devhuba.kotlinbasics

data class User(val id: Long, val name: String)


fun main() {
    val user1 = User(1, "Bill")
    
    val userName = user1.name

    val updatedUser = user1.copy(name = "Jone")
    println(user1)
    println(updatedUser)

    println(updatedUser.component1())
    println(updatedUser.component2())

    val (id,name) = updatedUser
    println("id = $id, name = $name")

}