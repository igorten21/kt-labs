package laba4

fun main() {

    print("введите страну: ")
    val string= readln()

    when(string.lowercase()){
        "россия"-> println("национальность: русские" +
                "население: 144.2 миллиона" +
                "язык: русский")
        "сша"-> println("национальность: американцы" +
                "население: 333.3 миллиона" +
                "язык: английский")
        "китай"-> println("национальность: китайцы" +
                "население: 1.412 миллиарда" +
                "язык: китайский")
        "казахстан"-> println("национальность: казахи" +
                "население: 19.62 миллиона" +
                "язык: казахский")
        "корея"-> println("национальность: корейцы" +
                "население: 51.63 миллиона" +
                "язык: корейский")
        "франция"-> println("национальность: французы" +
                "население: 67.97 миллиона" +
                "язык: французский")
        "германия"-> println("национальность: немцы" +
                "население: 83.8 миллиона" +
                "язык: немецкий ")
        else-> println("ошибка")
    }

}