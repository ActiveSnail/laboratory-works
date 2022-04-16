import java.awt.Point

fun foo(n : Int): Boolean {
    if (n % 10 != 0 && n % 5 == 0) return true;
    else return false;
}

fun main() {
    println("Введите число n: ")
    var n = readLine()?.toIntOrNull();
    var k = 0;

    for (i in 1..n!!){
        println("Введите следующее число ai: ");
        if(foo(readLine()?.toIntOrNull()!!)) k+=1;
    }

    println(k)
}