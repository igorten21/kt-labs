package laba3

fun main() {

    print("enter first side: ")
    val a = readln().toInt()
    print("enter second side: ")
    val b = readln().toInt()
    print("enter third side: ")
    val c = readln().toInt()

    if(a<b+c && b<a+c && c<a+b)
        println("triangle exist")
    else
        println("triangle does not exist")

}