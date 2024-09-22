package laba5

fun main(){
    println("Enter the start of the range: ")
    val start = readln().toInt()
    println("Enter the end of the range: ")
    val end = readln().toInt()

    for (i in start..end) {
        if (isPrime(i))
            println(i)
    }
}

// по какой-то причине, программа видит функцию isPrime из 5-5 и работает так, во магия