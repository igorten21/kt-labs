package laba6

import kotlin.random.Random

fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: ${n.joinToString() }")

    for (i in 0 until n.size - 1) {
        for (j in 0 until n.size - i - 1) {
            if (n[j] > n[j + 1]) {
                val temp = n[j]
                n[j] = n[j + 1]
                n[j + 1] = temp
            }
        }
    }

    println("sorted array: ${n.joinToString()}")
}
