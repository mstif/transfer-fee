package ru.netology

import kotlin.math.roundToInt

const val percentFee = 0.75
const val minFee = 35 * 100
fun main() {
    val amount = 4550 * 100
    println("Комиссия с перевода $amount копеек составит ${getTransferFee(amount)} копеек")

}

fun getTransferFee(amount: Int): Int {

    val fee = (amount * percentFee / 100).roundToInt()
    return fee.coerceAtLeast(minFee)
}