fun main() {
    val n = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    var count = 0
    for (i in 0 until n) {
        mutList.add(readLine()!!.toInt())
    }
    for (i in 0 until mutList.lastIndex - 1) {
        if (mutList[i] + 1 == mutList[i + 1] && mutList[i] + 2 == mutList[i + 2]) count++
    }
    println(count)
}
