package laba6

fun main() {

    val arr= arrayOf("ewe",213,42,"samsung",42.424242,6,69,true)
    println("array: ${arr.joinToString ()}}")

    println("unique elements: ")
    for(i in arr){
        if(i is Int)
            continue
        else
            print("$i, ")
    }


}