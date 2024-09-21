package laba3

fun main() {

    print("enter distance in km: ")
    val km = readln().toInt()
    print("enter distance in ft: ")
    val ft = readln().toInt()

    if(km*1000>ft*0.305) // км в метры, футы тоже в метры
        print("$km km is greater than $ft ft")
    else
        print("$ft ft is greater than $km km")
}