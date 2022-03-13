package ru.netology

import kotlin.math.roundToInt

const val PERCENT_FEE = 0.75
const val MIN_FEE = 35 * 100
fun main() {
    val amount = 4550 * 100
    println("Комиссия с перевода $amount копеек составит ${getTransferFee(amount)} копеек")

}

fun getTransferFee(amount: Int): Int {

    val fee = (amount * PERCENT_FEE / 100).roundToInt()
    return fee.coerceAtLeast(MIN_FEE)
}