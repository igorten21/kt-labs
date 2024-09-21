package laba4

fun main() {

    print("guess the number and enter it: ")
    val n = readln().toInt()

    when(n){
        4242-> println("you guessed")
        else-> println("you lose")
    }

}