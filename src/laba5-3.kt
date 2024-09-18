fun main(){
    print("enter N: ")

    var n = readln().toInt()
    var i=0
    var sum=0

    for (i in 1..n) {
        sum +=i
    }

    println("sum = $sum")
}