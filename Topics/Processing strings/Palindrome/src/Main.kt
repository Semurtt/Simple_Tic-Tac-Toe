fun main() {
    val string = readLine()!!.toString()
    println(if (string.reversed() == string) "yes" else "no")
}