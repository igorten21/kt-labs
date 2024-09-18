
fun main() {
    print("enter number: ")
    var n= readln().toInt()
    val isPrime = isPrime(n)

    if (isPrime)
        println("$n is a prime number.")
    else
        println("$n is not a prime number.")

}


fun isPrime(n: Int): Boolean {
    if (n <= 1) {
        return false
    }
    for (i in 2 until n) {
        if (n % i == 0)
            return false

    }
    return true
}
