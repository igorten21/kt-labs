package laba6

fun main(){

    val n = listOf(4,2,3,2,4)

    when {
        n==n.reversed() -> println("palindrome")
        else -> println("not a palindrome")
    }


}