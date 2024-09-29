package laba6

import kotlin.random.Random

fun main(){

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: $n")

    print("enter element index to delete: "); val el= readln().toInt()

    n.removeAt(el)

    println("new array: $n")

}