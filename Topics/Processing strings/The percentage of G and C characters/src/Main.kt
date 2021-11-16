fun main() {
    val string = readLine()!!.lowercase()
    var count = 0.0
    for (i in string) {
        if (i == 'g' || i == 'c') count++
    }
    val formula = count / string.length * 100
    println(formula)
}