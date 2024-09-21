package laba4

fun main() {

    print("enter first side: ")
    val a = readln().toInt()
    print("enter second side: ")
    val b = readln().toInt()
    print("enter third side: ")
    val c = readln().toInt()

    when{
        a==b && b==c -> println("equilateral triangle") //равносторонний
        a==b||b==c||a==c-> println("isosceles triangle") //равнобедренный
        else-> println("scalene triangle") //разносторонний
    }

}