package com.example.introductionkotlin.KotlinFundamentals

fun main() {

    // test 1
    val trafficLightColor = "Red"

    when (trafficLightColor){
        "Red" -> print("Stop")
        "Yellow" -> print("Slow")
        "Green" -> print("Go")
        else -> print("Invalid traffic-light color")
    } // Stop

    // test 2
    val x = 5

    when (x){
        1,3,5,7,9 -> print("Tao la so le")
        2,4,6,8 -> print("Tao la so chan")
        else -> print("Khong biet")
    } // Tao la so le

    // test 3
    val y: Any = 20

    when (y) {
        2, 3, 5, 7 -> println("y is a prime number between 1 and 10.")
        in 1..10 -> println("y is a number between 1 and 10, but not a prime number.")
        is Int -> println("y is an integer number, but not between 1 and 10.")
        else -> println("y isn't an integer number.")
    } // y is an integer number, but not between 1 and 10.
}