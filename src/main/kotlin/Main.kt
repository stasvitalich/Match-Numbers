// Принцип работы when в Kotlin.
// Создадим программу, которая будет на вход принимать число, написанное прописью,
// а затем будет возвращать его численное ззначение.

fun main () // Заводим основную функцию, в которой будем прописывать тело программы.
{
    println("Напишите прописью цифру от 0 до 10") // Даём пользователю инструкцию
    val yourText: String? = readLine() // Заводим переменную, которая будет принимать на вход текст
    var digit: Int // Заводим переменную типа Int, которую будем присваивать
    when (yourText) { // Когда введёныый текст
        "Один" -> digit = 1 // равен Один, то переменная digit обретает значение 1
        "Два" -> digit = 2
        "Три" -> digit = 3
        else -> {
            println("Значение отсутствует") // В проивном случае, значаение отсутствует.
            return // И делаем возврат, если значения нет
        }
    }
    println(digit) // Распечатываем значение нашей переменной
}