package laba2

fun main() {

    print("enter first number: ")
    val a = readln().toDouble()
    print("enter second message: ")
    val b = readln().toDouble()

    val x = Math.pow(a,b).toInt()
    println("${a.toInt()} to the degree of ${b.toInt()} = $x")
}