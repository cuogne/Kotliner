package com.example.introductionkotlin

fun main() {
    val numberOfAdults = "20" // or change "20" -> 20
    val numberOfKids = "30" // or change "30" -> 30
//    val total = numberOfAdults + numberOfKids
    val total = numberOfAdults.toInt() + numberOfKids.toInt()
    println("The total party size is: $total")
}