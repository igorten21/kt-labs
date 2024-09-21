package laba4

fun main() {

    print("enter hour (0-23): ")
    val n = readln().toInt()

    when(n){
        in 0..4 -> println("night")
        in 4..12-> println("morning")
        in 12..17-> println("afternoon")
        in 17..20-> println("evening")
        in 20..23-> println("night")
        else-> println("error")
    }

}