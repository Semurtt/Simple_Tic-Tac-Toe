fun main() {
    val n = readLine()!!.toInt()
    var a = mutableListOf<Int>()
    var temp = MutableList(n) { 0 }
    for (i in 0 until n) {
        a.add(readLine()!!.toInt())
    }
    val shift = readLine()!!.toInt()
    repeat(shift % n) {
        temp = MutableList(n) { 0 }
        for (i in 1 until n) {
            temp[i] = a[i - 1]
        }
        temp[0] = a.last()
        a = temp
    }
    println(a.joinToString(" "))
}
