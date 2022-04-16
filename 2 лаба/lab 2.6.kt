
fun sum(n : Int) : Int{
    if (n < 10) return n;
    else return sum(n / 10) + n % 10;
}

fun main() {
    println("Введите число: ")
    println(readLine()?.toIntOrNull()?.let { sum(it) })
}