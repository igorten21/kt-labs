package laba9

fun longestWord(str: String): String {
    when {
        str.isBlank() -> print("string is empty")
    }
    val list = str
        .replace("""[.,;:/\\]""".toRegex(), " ")
        .replace("\\s+".toRegex(), " ")
        .split(" ")
        .sortedBy { it.length }
    println(list)
    return list.last()
}

fun main() {
    println(longestWord("asadsa, Gooooooogle, Hello World"))
}