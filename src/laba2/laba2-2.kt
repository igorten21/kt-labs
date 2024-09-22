package laba2

fun main() {

    println("enter number")
    val n = readln().toInt()

    val u = n % 10 //единицы
    val t = (n / 10) % 10 //десятки
    val h = n / 100 //сотни

    val sum = h + t + u
    val prd = h * t * u

    println("Number of units: $u")
    println("Number of tens: $t")
    println("Sum of digits: $sum")
    println("Product of digits: $prd")

}