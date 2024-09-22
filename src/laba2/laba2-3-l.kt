package laba2

fun main() {

    val a=true
    val b=false
    val c=false

    println("not A and B: ${!a&&b}")
    println("A or not B: ${a||!b}")
    println("A and B or C: ${a&&b||c}")

}