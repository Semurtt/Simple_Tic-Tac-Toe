fun main() {
    val string = readLine()!!
    println(string.last() + string.substring(1, string.lastIndex) + string.first())
}