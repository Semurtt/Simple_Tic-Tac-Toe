fun main() {
    val string = readLine()!!.lowercase()
    val sub = readLine()!!.lowercase()
    val splitList = string.split(sub)
    println(splitList.lastIndex)
}