fun main() {
    val abc = readLine()!!.toString()
    var tru = 0
    for (i in 1..abc.lastIndex) {
        if (abc[i - 1] == abc[i] - 1) ++tru
    }
    if (abc.length - 1 == tru) println("true") else println("false")
}