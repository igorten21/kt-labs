package laba3

fun main() {

    print("enter a: ")
    val a = readln().toInt()
    print("enter b: ")
    val b = readln().toInt()

    if(a%b==0)
        print("$a is a divisor of $b")
    else
        print("$a is not a divisor of $b")
}