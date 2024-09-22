package laba5

import kotlin.random.Random

fun main() {
    val rand = Random
    val lst = List(rand.nextInt(2, 4)) { List(3) {rand.nextInt(0, 100)} }

    val transpose = MutableList(lst[0].size) { MutableList(lst.size) { 0 } }

    println(lst)

    for (i in 0..<lst[0].size) {
        for (j in 0..<lst.size) {
            transpose[i][j] = lst[j][i]
        }
    }

    println(transpose)

}

// каюсь, украл, зато с каким удовольствием