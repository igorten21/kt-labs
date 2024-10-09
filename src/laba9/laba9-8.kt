package laba9

import kotlin.random.Random

fun main() {
    print("enter number: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 0
    val rand = Random.nextInt(1, 100)
    when {
        a == rand -> println("you win")
        else -> println("you lose, number was: $rand")
    }
}