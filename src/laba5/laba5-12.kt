package laba5

fun main(){

    print("enter first number: ")
    val n= readln().toInt()

    print("enter step: ")
    val s= readln().toInt()

    print("enter number of elements: ")
    val x= readln().toInt()

    println("number sequence:")
    for(i in 0..x){
        print("${n+i*s}  ")
    }


}