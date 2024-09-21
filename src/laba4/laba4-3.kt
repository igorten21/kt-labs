package laba4

fun main() {

    println("enter grade by number")
    val n= readln().toInt()

    when(n){
        1-> println("bad")
        2-> println("unsatisfactory")
        3-> println("satisfactorily")
        4-> println("good")
        5-> println("great")
    }

}