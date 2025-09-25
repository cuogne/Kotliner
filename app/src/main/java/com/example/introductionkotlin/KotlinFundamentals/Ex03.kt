package com.example.introductionkotlin.KotlinFundamentals

fun main() {
    // test 1
    val trafficLightColor = "Amber"

    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Slow"
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message) // Slow

    // test 2
//    val trafficLightColor = "Black"
//
//    val message =
//        // remove println
//        if (trafficLightColor == "Red") "Stop"
//        else if (trafficLightColor == "Yellow") "Slow"
//        else if (trafficLightColor == "Green") "Go"
//        else "Invalid traffic-light color"
//
//    println(message)
}