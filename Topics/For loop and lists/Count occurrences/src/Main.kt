fun main() {
    val n = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    var count = 0
    for (i in 1..n) {
        mutList.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    for (i in mutList) {
        if (m == i) ++count
    }

    println(count)
}
