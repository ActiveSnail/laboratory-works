import java.awt.Point

fun foo(n : String): Boolean {
    if (n == n.reversed()) return true;
    else return false;
}

fun main() {
    println("Введите первое натуральное число: ")
    var n1 = readLine();
    println("Введите второе натуральное число: ")
    var n2 = readLine();

    if (foo(n1!!) || foo(n2!!)){
        println("Хотя бы одно из заданных чисел является палиндромом!")
    }
    else print("Ни одно из заданных чисел не является палиндромом!");

}