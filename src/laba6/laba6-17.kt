package laba6

import kotlin.random.Random

fun main(){

    print("enter array size: "); val s = readln().toInt()
    val n = List<Int>(s){ Random.nextInt(1,100)}
    println("generated array: $n\n")

    val prd = n.reduce{acc,i -> acc*i}


    println("sum of array elements: ${n.sum()}\n" +
            "product of array elements: $prd")

}