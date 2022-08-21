package com.pesh.arithmetics.util

class Arithmetic(numbOne: Double, numbTwo: Double) {
    private var num1: Double
    private var num2: Double

    init {
        num1 = numbOne
        num2 = numbTwo
    }

    fun add(): Double = num1 + num2
    fun subtract(): Double = num1 - num2
    fun multiply(): Double = num1 * num2
    fun divide(): Double = num1 / num2
}