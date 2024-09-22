package laba5

import kotlin.random.Random

fun main(){
    val rand = Random.nextInt(1, 100)
    print("guess number: ")
    val a = readlnOrNull()?.toIntOrNull() ?: 0

    println(when {
        a == rand -> "you won"
        else -> "you lose, right number was: $rand"
    })
}