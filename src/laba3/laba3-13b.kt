package laba3

fun main() {

    print("enter number: ")
    val a = readln().toInt()

    val a1 = a / 1000
    val a2 = (a % 1000) / 100
    val a3 = (a % 100) / 10
    val a4 = a % 10
    if (a1+a2+a3+a4%3==0)
        println("the sum of all digits is a multiple of 3");
    else
        println("the sum of all digits is not a multiple of 3");

}