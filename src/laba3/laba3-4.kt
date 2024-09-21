package laba3

fun main(){

    print("enter first number: ")
    val a = readln().toInt()
    print("enter second number: ")
    val b = readln().toInt()

    if(a%b==0)
        println("number $a can be divided by number $b without remainder")
    else {
        val x:Double
        x = (a%b).toInt().toDouble()
        println("number $a can not be divided by number $b without remainder")
        println("remainder of dividing $a and $b = $x")
    }
}