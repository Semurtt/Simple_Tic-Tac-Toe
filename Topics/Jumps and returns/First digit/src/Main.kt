fun main() {
    val string = readLine()!!
    for (i in string) {
        if (i.isDigit()) return print(i)
    }
}