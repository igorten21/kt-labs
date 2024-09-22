package laba2

fun main() {

    // тут есть разделение задания на буквы, но я сделаю всё в одном

    print("enter number: ")
    val n = readln().toInt()

    val t = n / 10 //единицы
    val u = n % 10 //десятки

    val sum=  t + u
    val prd = t * u

    println("number of tens: $t")
    println("number of units: $u")
    println("sum of digits: $sum")
    println("product of digits $prd")
}