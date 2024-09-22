package laba2

fun main(){

    val x=false
    val y=false
    val z=true

    println("X or Y and not Z: ${x||y&&!z}")
    println("X and not Y or Z: ${x&&!y||z}")
    println("not X and not Y: ${!x&&!y}")
    println("X and (not Y or Z): ${x&&(!y||z)}")
    println("not (X and Z) or Y: ${!(x&&z)||y}")
    println("X or (not(Y or Z)): ${x||(!(y||z))}")

}