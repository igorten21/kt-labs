package laba3

fun main(){

    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()
    print("enter third number: ")
    val c = readln().toInt()
    println("you entered - $a, $b, $c")

    if (a>=b && a>=c)
        println("largest number: $a")
    else if (b>=a && b>=c)
        println("largest number: $b")
    else
        println("largest number: $c")
}