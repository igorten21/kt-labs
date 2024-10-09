package laba9

fun sortStrList(list: List<String>): List<String> {
    return list.sorted()
}

fun main() {
    println(sortStrList(listOf("test", "sdasdasd", "hello", "abcd")))
}