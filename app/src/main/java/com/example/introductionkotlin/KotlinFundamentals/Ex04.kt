package com.example.introductionkotlin.KotlinFundamentals

fun main() {
//    var favoriteActor: String = "Sandra Oh"
//    favoriteActor = null // Null can not be a value of non-null type String

    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor) // Sandra Oh

    favoriteActor = null
    println(favoriteActor) // null

    // safe call operator (?.)
    println(favoriteActor?.length) // if favoriteActor isn't null => length is work => 9

    // if/else check (!= null or == null)
    if(favoriteActor != null) {
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
        println("You didn't input a name.")
    }

    // elvis operator (?:)
    val lengthOfName = favoriteActor?.length ?: 0
    // if favoriteActor is null => length is null => lengthOfName = 0, else = 9

    // non-null assertion
    // assert that the value of variable isn't null => if null => crash => NullPointerException
//    var favoriteActor: String? = "Sandra Oh"
//    println(favoriteActor!!.length) // Error: NullPointerException
}