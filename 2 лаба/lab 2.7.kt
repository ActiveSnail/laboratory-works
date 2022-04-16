
fun SumDigit(n : Int) : Int{
    if (n < 10) return n;
    else return SumDigit(n / 10) + n % 10;
}

fun DigitRoot (n : Int): Int {
    if (n < 10) return n;
    else return DigitRoot(SumDigit(n));
}

fun main() {
    println("Введите число: ");
    var n = readLine()?.toIntOrNull();
    println("Цифровой корень из числа " + n!! + " равен " + DigitRoot(n!!))
}