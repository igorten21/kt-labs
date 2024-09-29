package laba6

import kotlin.random.Random

fun main(){

    //решил попробовать новый вариант генератора массивов
    val n = List<Int>(20){Random.nextInt(1,100)}
    println("generated array: $n")

}