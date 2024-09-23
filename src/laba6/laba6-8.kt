package laba6

import kotlin.random.Random

fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: ${n.joinToString() }")

    print("enter what to find: ")
    val f= readln().toInt()

    for (i in n){
        if(i==f)
            println("index of searchable element: ${n.indexOf(i)}")
    }

}