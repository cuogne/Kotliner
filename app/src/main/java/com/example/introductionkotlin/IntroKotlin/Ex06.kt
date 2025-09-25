package com.example.introductionkotlin.IntroKotlin

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(num1: Int, num2: Int) = num1 + num2

// another define
fun add2(num1: Int, num2: Int): Int {
    return num1 + num2
}

// subtract
fun subtract(num1: Int, num2: Int): Int {
    return num1 - num2
}