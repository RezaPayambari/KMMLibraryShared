package com.example.myfirstkmmapp.services.operators

class Div : Operator {
    override fun calculate(numbers: ArrayList<Double>): Double {

        var list: ArrayList<Double> = ArrayList(numbers)
        var result: Double = list[0]
        list.removeAt(0)

        for (i: Double in list)
            result /= i


        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY)
            throw ArithmeticException()

        return result
    }
}