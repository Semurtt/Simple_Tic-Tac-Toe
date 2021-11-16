fun main() {
    val string = readLine()!!.split(" ")
    if (string[1].toInt() > string[0].length) {
        println(string[0])
    } else if (string[1].toInt() < string[0].length) {
        print(string[0].substring(string[1].toInt()))
        println(string[0].substring(0, string[1].toInt()))
    }
}