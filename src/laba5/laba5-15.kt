package laba5

fun main (){

    print("enter something: ")
    val string= readln()

    if(string==string.reversed())
        println("string is palindrom")
    else
        println("string is not a palindrom")

}