fun main() {
    val word = readLine()!!.lowercase()
    val vowel = "aeiouy"
    var count = 0
    var vwl = 0
    var con = 0
    for (i in word) {
        if (i in vowel) {
            vwl++
            con = 0
        } else if (i !in vowel) {
            con++
            vwl = 0
        }
        if (vwl == 3 || con == 3) {
            count++
            vwl = 1
            con = 1
        }
    }
    println(count)
}