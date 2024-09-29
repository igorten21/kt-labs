package laba6

fun main(){

    print("enter last number of array: "); val n = readln().toInt()
    print("enter step: "); val s = readln().toInt()

    println((0..n step s).toList())

}