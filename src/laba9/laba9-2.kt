package laba9

fun main() {
    val vowels = listOf('a', 'e', 'i', 'o', 'u', 'а', 'у', 'о', 'и', 'э', 'ы', 'я', 'ю', 'е', 'ё')
    val consonants = ('а'..'я').filter { it !in vowels } + ('a'..'z').filter { it !in vowels }

    print("enter something: ")
    val a = readln()
    println("cowels: ${a.count { it in vowels }}")
    println("consonants: ${a.count { it in consonants }}")
}