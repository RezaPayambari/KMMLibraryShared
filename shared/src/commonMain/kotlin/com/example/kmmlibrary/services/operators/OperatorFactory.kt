package com.example.myfirstkmmapp.services.operators

import com.example.myfirstkmmapp.models.OperatorType

class OperatorFactory {
    companion object {
        fun getOperator(operatorType: OperatorType): Operator {
            when (operatorType) {
                OperatorType.DIV -> return Div()
                OperatorType.MUL -> return Mul()
                OperatorType.SUM -> return Sum()
                OperatorType.SUB -> return Sub()
                else -> throw UnsupportedOperationException()
            }
        }
    }
}