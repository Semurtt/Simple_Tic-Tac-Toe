fun main() {
    val string = readLine()!!.lowercase()
    var count = 0
    var solo = 0
    for (i in 'a'..'z') {
        for (j in string) {
            if (j == i) count++
        }
        if (count == 1) solo++
        count = 0
    }
    println(solo)
}

