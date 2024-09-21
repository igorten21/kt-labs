package laba3

fun main() {

    print("enter number: ")
    val n = readln().toInt()

    if (n/10<n%10)
        println("first digit is greater than second")
    else if (n/10>n%10)
        println("second digit is greater than first")
    else
        println("both digits are equal")
}