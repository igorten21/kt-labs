package laba5

fun main(){

    print("enter number: ")
    val n= readln().toInt()

    for (i in 1..n) {
        println("#".repeat(i))
    }

}