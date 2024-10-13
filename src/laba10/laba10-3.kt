package laba10

fun caesarEncrypt(str: String): String {
    return str.map { (it.code + 3).toChar() }.joinToString("")
}

fun caesarDecrypt(str: String): String {
    return str.map { (it.code - 3).toChar() }.joinToString("")
}

fun main(){
    println("1 - encrypt" +
            "2 - decrypt:" +
            "enter action:")
    val action= readln().toInt()
    print("enter something"); val str= readln().toString()

    when (action){
        1 -> caesarEncrypt(str)
        2 -> caesarDecrypt(str)
        else -> println("error")
    }

}