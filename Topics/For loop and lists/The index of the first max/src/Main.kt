fun main() {
    val n = readLine()!!.toInt()
    val mutList = mutableListOf<Int>()
    var max = 0
    var count = -1
    var ind = 0
    for (i in 0 until n) {
        mutList.add(readLine()!!.toInt())
    }
    for (i in mutList) {
        ++count
        if (i > max) {
            max = i
            ind = count
        }
    }

    println(ind)
}
