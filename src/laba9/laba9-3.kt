package laba9

const val usd_to_eur = 0.91

fun dollarToEuro(dollar: Double): Double {
    return dollar * usd_to_eur
}

fun main() {
    print("enter usd: "); val n = readln().toDouble()
    println(dollarToEuro(n))
}
