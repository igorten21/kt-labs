package laba4

fun main() {

    print("enter number of day in week: ")
    val n = readln().toInt()

    when(n){
        1-> println("monday")
        2-> println("tuesday")
        3-> println("wednesday")
        4-> println("thursday")
        5-> println("friday")
        6-> println("saturday")
        7-> println("sunday")
        else-> println("error")
    }

}