package laba10

fun fizzBuzz(n: Int): MutableList<Any> {
    val list = mutableListOf<Any>()
    for (i in 1..n) {
        when {
            i % 3 == 0 && i % 5 == 0 -> list.add("ВизллБизлл")
            i % 3 == 0 -> list.add("Физллл")
            i % 5 == 0 -> list.add("Бизлллл")
            else -> list.add(i)
        }
    }

    return list
}

fun main(){
    print("enter number: "); val n  = readln().toInt()
    println(fizzBuzz(n))
}