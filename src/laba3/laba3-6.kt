package laba3

fun main() {

    print("enter year: ")
    val y= readln().toInt()

    if(y%4==0)
       println("$y is a leap year")
    else
        println("$y is not a leap year")

}