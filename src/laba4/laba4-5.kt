package laba4

fun main() {

    print("enter number: ")
    val n = readln().toInt()

    when{
        n>0-> println("$n is positive")
        n<0-> println("$n is negative")
        else-> println("$n is null")
    }
}