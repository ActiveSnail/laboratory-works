

fun main() {
    println("Введите число для проверки: ")
    var n = readLine()?.toIntOrNull();
    var simple = true;

    for (i in 2..n!!){
        if (n!! % i == 0 && n!! != i){
            simple = false;
            break
        }
    }

    println(simple)
}