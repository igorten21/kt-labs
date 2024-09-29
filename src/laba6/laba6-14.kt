package laba6

import kotlin.random.Random

fun main(){

    print("enter array size: "); val s = readln().toInt()
    val n = List<Int>(s){ Random.nextInt(1,100)}
    println("generated array: $n\n")

    println("numbers dividing by 3: ${n.filter { i -> i%3==0 }}")

}