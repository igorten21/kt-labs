package laba3

fun main(){

    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()
    println("you entered - $a, $b")

    if (a%2==0 && b%2!=0)
        println("$a is an even number")
    else if (b%2==0 && a%2!=0)
        println("$b is an even number")
    else
        println("error")
}