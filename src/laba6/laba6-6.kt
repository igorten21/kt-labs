package laba6

import kotlin.random.Random

fun main() {

    print("enter array size: ")
    val s= readln().toInt()
    val n = mutableListOf<Int>(s)
    for(i in 0..s)
        n.add(Random.nextInt(0,100))
    println("generated array: ${n.joinToString() }")

    var odd=mutableListOf<Int>()
    var even=mutableListOf<Int>()

    for (i in n){
        if(i%2==0)
            even.add(i)
        else
            odd.add(i)
    }

    println("odd array: $odd")
    println("even array: $even")
}