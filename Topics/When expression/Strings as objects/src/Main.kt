fun main() {
    val input = readLine()!!.toString()
    if (input.isEmpty()) println(" ") else {
        println(
            when (input.first()) {
                'i' -> input.substring(1).toInt() + 1
                's' -> input.substring(1).reversed()
                else -> input
            }
        )
    }
    val a = 10
    when (a) {
        in 1..22 -> print("Ok")
        "2" -> print("Ok")
            > 0 -> print("Ok")
        11, 12 -> print("Ok")
        a + a -> print("Ok")
        in 1..20 -> print("Ok"); print("Ok")
    }
}
