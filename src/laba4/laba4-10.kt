package laba4

fun main() {

    println("Выбор способа оплаты:" +
            "1) Наличные" +
            "2) Кредитная карта" +
            "3) PayPal")
    print("Введите номер способа: ")
    val n=readln().toInt()

    when(n){
        1-> println("Выбрана оплата наличными")
        2-> println("Выбрана оплата картой")
        3-> println("Выбрана оплата при помощи PayPal")
        else-> println("Неверное значение")
    }

}