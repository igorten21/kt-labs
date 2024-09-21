package laba3

fun main() {

    print("enter first number: ")
    val a = readln().toDouble()
    print("enter second number: ")
    val b = readln().toDouble()

    if(a>b)
        println("$a is greater than $b")
    else
        println("$b is greater than $a")
}