package com.example.myfirstkmmapp.models

enum class  OperatorType {
    SUB("-"),
    SUM("+"),
    MUL("*"),
    DIV("/"),
    INVALID("Invalid operator");

    lateinit var operator: String

    constructor(operator: String) {
        this.operator = operator
    }
/**
    fun decode(operator: String): OperatorType {
        return OperatorType.values().filter { targetEnum -> targetEnum.operator.equals(operator) }.first()
    }

    fun getOperator(): String {
        return operator
    }
*/
}
