fun main() {
    val n = readLine()!!.toInt()
    val a = mutableListOf<Int>()
    val temp = MutableList(n) { 0 }
    for (i in 0 until n) {
        a.add(readLine()!!.toInt())
    }
    for (i in 1 until n) {
        temp[i] = a[i - 1]
    }
    temp[0] = a.last()
    println(temp.joinToString(" "))
}
