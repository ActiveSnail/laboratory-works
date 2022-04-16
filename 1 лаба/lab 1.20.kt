

fun main() {
    println("Введите натуральное число к:");
    var k = readLine()?.toIntOrNull();
    println("Введите натуральное число m:");
    var m = readLine()?.toIntOrNull();

    var res = "";

    for (i in k!!..m!!){
        res += i.toString() + " ";
    }

    println(res);
}