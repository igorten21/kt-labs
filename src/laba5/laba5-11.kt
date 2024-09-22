package laba5

fun main(){

    print("enter first word: ")
    val a = readln()
    print("enter second word: ")
    val b = readln()

    if(isAnagram(a, b))
        println("words $a and $b are anagrams")
    else
        println("words $a and $b are not anagrams")

}

fun isAnagram(a:String, b:String):Boolean {
    val sortA = a.replace(" ","").lowercase().toCharArray().sorted()
    val sortB = b.replace(" ","").lowercase().toCharArray().sorted()
    return sortA==sortB
}