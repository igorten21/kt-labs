package laba3

fun main() {

    print("enter m: ")
    val m = readln().toInt()
    print("enter n: ")
    val n = readln().toInt()

    if(m%n==0) {
        val x=m/n
        println("number $m can be divided by number $n without remainder")
        println("$m / $n = $x")
    }
    else
        println("number $m can not be divided by number $n without remainder")
}