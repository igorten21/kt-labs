package laba9

fun String.reverseCase(): String {
    return map {if (it.isLowerCase()) it.uppercase() else it.lowercase()}.joinToString("")
}

fun main() {
    println("QqWwEeRrTtYy".reverseCase())
}