fun main() {
    val n = readLine()!!
    println(
        when (n.length) {
            1 -> 1
            2 -> 2
            3 -> 3
            4 -> 4
            else -> "error!"
        }
    )
}
