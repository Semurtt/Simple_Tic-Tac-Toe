fun main() {
    val n = readLine()!!.toInt()
    val a = mutableListOf<Int>()
    var res = "YES"
    for (i in 0 until n) {
        a.add(readLine()!!.toInt())
    }
    val num = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    for (i in 1 until n) {
        if (a[i - 1] == num[0] && a[i] == num[1] || a[i - 1] == num[1] && a[i] == num[0]) res = "NO"
    }
    println(res)
}
