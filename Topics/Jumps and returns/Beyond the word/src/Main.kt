fun main() {
    val string = readLine()!!.lowercase()
    for (i in 'a'..'z') {
        if (i !in string) print(i) else continue
    }
}