package laba10

fun pyramid(n: Int) {
    for (i in 0..<n) {
        println("'" + " ".repeat(n-i-1) + "#".repeat(i*2+1) + " ".repeat(n-i-1) + "'")
    }
}

fun main(){
    print("enter size of pyramid: "); val size  = readln().toInt()
    pyramid(size)
}