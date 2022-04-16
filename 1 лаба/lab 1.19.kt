

fun main() {
    println("Введите возраст: ")
    var age = readLine()?.toIntOrNull();

    if (age!! <= 6) println("Дошкольник");
    else if (7 <= age!! && age!!<= 18) println("Школьник");
    else if (19 <= age!! && age!!<= 59) println("Рабочий");
    else if (60 <= age!!) println("Пенсионер");
}