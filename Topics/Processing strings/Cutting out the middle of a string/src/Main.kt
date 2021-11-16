fun main() {
    val string = readLine()!!
    if (string.length % 2 == 0) {
        println(string.substring(0, string.length / 2 - 1) + string.substring(string.length / 2 + 1))
    } else if (string.length % 2 == 1) {
        println(string.substring(0, string.length / 2) + string.substring(string.length / 2 + 1))
    }
}