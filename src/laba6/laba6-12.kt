package laba6

import kotlin.random.Random

fun swap(array: MutableList<Int>, from: Int, to: Int) {
    val temp = array[from]
    array[from] = array[to]
    array[to] = temp
}

fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: $n")

    swap(n, 1, 2)
    println(n)

}