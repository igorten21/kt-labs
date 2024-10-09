package laba9

fun isAnagram(str1: String, str2: String): Boolean {
    if (str1.length != str2.length)
        return false
    return str1.toList().any { it in str2.toList()}
}

fun main() {
    println(isAnagram("abc", "bca"))
}