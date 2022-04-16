import java.util.*


fun main() {
    val nums: Queue<Int> = LinkedList();

    while (true){
        var n = readLine()?.toIntOrNull();
        if (n != null) nums.add(n!!);
        else {
            while (nums.peek() != null) { // или !queue.isEmpty()
                System.out.println(nums.poll());
            }
            break
        }
    }
}