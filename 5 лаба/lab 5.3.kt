import java.util.*


fun main() {
    val nums = Stack<Int>()

    while (true){
        var n = readLine()?.toIntOrNull();
        if (n != null) nums.push(n!!);
        else {
            while (!nums.empty()) {
                println(nums.pop())
            }
            break
        }
    }
}