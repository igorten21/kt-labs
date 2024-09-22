package laba5

import kotlin.random.Random

fun main() {

    print("enter array size: ")
    val s= readln().toInt()

    val array = IntArray(s) {Random.nextInt(0, 100)}
    println("original array: ${array.contentToString()}")

    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }

    println("sorted array: ${array.contentToString()}")
}