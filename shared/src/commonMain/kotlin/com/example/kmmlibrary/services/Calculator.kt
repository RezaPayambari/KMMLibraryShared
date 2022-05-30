package com.example.myfirstkmmapp.services

import com.example.myfirstkmmapp.models.OperatorType

interface Calculator {
    fun calculate(operatorType: OperatorType, operands: ArrayList<Double>): Double
}