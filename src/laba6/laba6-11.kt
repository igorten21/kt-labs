package laba6

import kotlin.random.Random


fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    val m = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    for (i in 0..s)
        m.add(Random.nextInt(0,100))
    println("generated array 1: $n")
    println("generated array 2: $m")

    println("array intersection: ${n.intersect(m)}")

}