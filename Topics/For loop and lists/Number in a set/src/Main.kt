fun main() {
    val n = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    for (i in 1..n) {
        mutList.add(readLine()!!.toInt())
    }
    val m = readLine()!!.toInt()
    if (m in mutList) println("YES") else println("NO")
}
