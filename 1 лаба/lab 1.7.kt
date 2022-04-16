import java.lang.Math.pow

fun main() {
    var sum = 0.0;
    for (i in 1..11 step 2){
        sum += pow(2.0, i.toDouble()) / i;
    }
    println("Сумма ряда = " + sum)
}