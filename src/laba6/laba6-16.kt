package laba6

import kotlin.random.Random

fun main(){

    print("enter first array size: "); val s1 = readln().toInt()
    val n1 = List<Int>(s1){ Random.nextInt(1,100)}
    println("generated array: $n1\n")

    print("enter second array size: "); val s2 = readln().toInt()
    val n2 = List<Int>(s2){ Random.nextInt(1,100)}
    println("generated array: $n2\n")

    println("new array: ${n1+n2}")

}