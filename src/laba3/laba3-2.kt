package laba3
fun main(){

    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()
    print("enter third number: ")
    val c = readln().toInt()

    if (a>b && a<c)
        println("average number: $a")
    else if (b>a && b<c)
        println("average number: $b")
    else if (c>a && c<b)
        println("average number: $c")
    else
        println("error")
}