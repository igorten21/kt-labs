package laba3

import kotlin.math.abs

fun main() {

    print("enter number: ")
    val n = readln().toInt()

    if(n%10==7)
        println("$n end in 7")
    else
        println("$n does nоt end in 7")

}