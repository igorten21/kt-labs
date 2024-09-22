package laba2

fun main(){

    val x=true
    val y=true
    val z=false

    println("not X and Y: ${!x&&y}")
    println("X or not Y: ${x||!y}")
    println("X or Y and Z: ${x||y&&z}")

}