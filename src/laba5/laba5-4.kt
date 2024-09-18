package laba5

fun main(){
    print("enter number: ")
    var n= readln().toInt()
    var i=0
    var fac=1
    for(i in 1..n){
        fac*=i
    }
    println("factorial = $fac")
}