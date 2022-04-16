fun main() {
    println("Введите натуральное число m: ");
    var m = readLine()?.toIntOrNull();
    println("Введите целое число n: ");
    var n = readLine()?.toIntOrNull();

    var num = 0;
    var sum = 0;

    println("Введите целые числа a1...am:");
    for (i in 1..m!!){
        var s = readLine()?.toIntOrNull();
        if (s != null) {
            if (s % n!! == 0){
                sum += s;
                num+=1
            }
        }
    }
    println(sum/num)
}
