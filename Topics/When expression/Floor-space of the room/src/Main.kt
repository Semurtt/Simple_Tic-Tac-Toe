import kotlin.math.sqrt

fun main() {
    val form = readLine()!!
    val square: Double
    when (form) {
        "triangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            val c = readLine()!!.toDouble()
            square = sqrt((a + b + c) / 2 * ((a + b + c) / 2 - a) * ((a + b + c) / 2 - b) * ((a + b + c) / 2 - c))
            println(square)
        }
        "rectangle" -> {
            val a = readLine()!!.toDouble()
            val b = readLine()!!.toDouble()
            square = a * b
            println(square)
        }
        "circle" -> {
            val r = readLine()!!.toDouble()
            val p = 3.14
            square = p * r * r
            println(square)
        }
    }
}
