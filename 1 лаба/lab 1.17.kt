import java.lang.Math.pow
import kotlin.math.sqrt

fun main() {
    println("Введите кол-во минут: ")
    var n = readLine()?.toIntOrNull();

    if (n!!<=500){
        println("С вас 350р")
    }
    else {
        println("С вас " + (350 + (n!!-500)*2) + "p.")
    }
}