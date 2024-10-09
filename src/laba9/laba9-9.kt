package laba9

fun main() {
    val symbols = ('1'..'z')
    println("enter count of using symbols: ")
    println((1..(readlnOrNull()?.toIntOrNull() ?: 5)).map { symbols.random() }.joinToString(""))
}