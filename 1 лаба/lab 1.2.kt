import java.lang.Math.pow
import kotlin.math.*

fun main() {
    println("Введите двузначное число: ")
    val n = readLine()?.toDoubleOrNull();

    val x = n?.div(10)?.let { Math.floor(it) };
    val y = n?.rem(10);


    if (n != null && x != null && y != null) {
        val result: Boolean = (n * n == 4 * (pow(x, 3.0) + pow(y, 3.0)))
        println(result);
    }
}