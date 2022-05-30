package com.example.myfirstkmmapp.services

import com.example.myfirstkmmapp.models.OperatorType
import com.example.myfirstkmmapp.services.operators.Operator
import com.example.myfirstkmmapp.services.operators.OperatorFactory

class CalculatorService: Calculator {
    override fun calculate(operatorType: OperatorType, operands: ArrayList<Double>): Double {
        var operator: Operator = OperatorFactory.getOperator(operatorType)
        return operator.calculate(operands)
    }
}