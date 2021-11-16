fun main() {
    val string = readLine()!!.toString().lowercase()
    var count = 0
    var temp = -1
    for (i in string.indices) {
        if (string[i] == 't' && string[i + 1] == 'h' && string[i + 2] == 'e') {
            temp = count
            break
        }
        ++count
    }
    println(temp)
}