import kotlin.math.*

fun main(){
    println("Введите площадь квадрата: ")
    val square_area = readLine()?.toDoubleOrNull();

    println("Введите площадь круга: ")
    val square_circle = readLine()?.toDoubleOrNull();

    if (sqrt(square_area!!) / 2 > sqrt(square_circle!! / PI)){
        println("Круг уместится в квадрат.")
    }
    else {
        println("Круг не уместится в квадрат.")
    }
}