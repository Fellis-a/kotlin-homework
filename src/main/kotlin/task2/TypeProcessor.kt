package task2

import java.time.LocalDate

fun main() {
    processAnyType("Привет, друг")
    processAnyType(9)
    processAnyType(7.777)
    processAnyType(LocalDate.of(2007, 9, 26))
    processAnyType(null)
    processAnyType(true)
}

fun processAnyType(value: Any?) {
    when (value) {
        null -> println("Объект равен null")

        is String -> println("Я получил тип String = ‘$value’, её длина равна ${value.length} символов")

        is Int -> println("Я получил Int = $value, его квадрат равен ${value * value}")

        is Double -> {
            val rounded = String.format("%.2f", value)
            println("Я получил Double = $value, это число округляется до $rounded")
        }

        is LocalDate -> {
            val foundationDate = LocalDate.of(2006, 12, 24)
            val comparison = if (value.isBefore(foundationDate)) "меньше" else "больше"
            println("Я получил LocalDate = $value, эта дата $comparison чем дата основания Tinkoff")
        }

        else -> println("Мне этот тип неизвестен(")
    }
}

