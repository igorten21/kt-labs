package laba2

fun main() {

    val a=true
    val b=false
    val c=false

    println("A or not (A and B) or C: ${a||!(a&&b)||c}")
    println("not A or A and (B or C): ${!a||a&&(b||c)}")
    println("(A or B and not C) and C: ${(a||b||!c)&&c}")

}