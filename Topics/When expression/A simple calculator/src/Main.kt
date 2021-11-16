fun main() {
    val (first, operator, second) = readLine()!!.split(" ")
    val a = first.toLong()
    val b = second.toLong()
    println(
        when (operator) {
            "+" -> a + b
            "-" -> a - b
            "/" -> if (b == 0L) "Division by 0!" else a / b
            "*" -> a * b
            else -> "Unknown operator"
        }
    )
}
