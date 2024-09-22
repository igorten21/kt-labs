package laba5

fun main() {

    print("enter first number: ")
    var a = readln().toInt()
    print("enter second message: ")
    var b = readln().toInt()

    while (a!=0 && b!=0) {
        if (a > b)
        a = a % b
        else
        b = b % a
    }

    print("greatest common divisor = $a + $b")

}