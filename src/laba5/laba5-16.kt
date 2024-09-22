package laba5

fun main(){

    print("enter n: ")
    val n = readln().toInt()
    var sum=0

    for (i in 1..n)
        sum+=i*i
    println("sum = $sum")

}