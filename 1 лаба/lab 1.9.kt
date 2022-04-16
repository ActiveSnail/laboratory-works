

fun main() {
    var n=1;
    println("на старте число амеб = 1")
    for (i in 3..24 step 3){
        n *= 2;
        println("Через " + i + "часов число амеб будет: " + n)
    }
}