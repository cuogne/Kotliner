package com.example.introductionkotlin

import kotlin.math.sqrt

fun main() {
    val n = 100
    for (temp in 1..n){
        if (isPrime(temp)){
            print("$temp ")
        }
    }
}

fun isPrime(num: Int): Boolean {
    if (num < 2){
        return false
    }

    for (x in 2..sqrt(num.toDouble()).toInt()){
        if (num % x == 0){
            return false
        }
    }
    return true
}