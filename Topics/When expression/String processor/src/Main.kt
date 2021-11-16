fun main() {
    val s1 = readLine()!!
    val op = readLine()!!
    val s2 = readLine()!!
    println(
        when (op) {
            "equals" -> s1 == s2
            "plus" -> s1 + s2
            "endsWith" -> s1.endsWith(s2)
            else -> "Unknown operation"
        }
    )
}
