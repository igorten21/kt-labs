package laba6

import kotlin.random.Random

fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: ${n.joinToString() }")

    var min=n[0]
    var max=n[0]

    for (i in n){
        if (i > max)
            max=i
    }

    for (i in n){
        if(i < min)
            min=i
    }

    println("min: $min\n" +
            "max: $max")

}