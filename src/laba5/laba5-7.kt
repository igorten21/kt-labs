package laba5

fun main(){

    print("enter number of digits: ")
    val n = readln().toInt()
    var t1 = 0
    var t2 = 1

    print("First $n terms: ")

    for (i in 1..n) {
        print("$t1, ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }

}