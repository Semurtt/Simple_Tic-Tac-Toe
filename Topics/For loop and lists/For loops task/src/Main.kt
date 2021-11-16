fun main() {
    val n = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    for (i in 0 until n) {
        mutList.add(readLine()!!.toInt())
    }
    val mutList2 = readLine()!!.split(" ").map { it.toInt() }.toMutableList()
    if (mutList2[0] in mutList && mutList2[1] in mutList) println("YES") else println("NO")
}
