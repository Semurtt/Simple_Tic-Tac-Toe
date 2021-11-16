fun main() {
    val date = readLine()!!.split("-").toMutableList()
    println("${date[1]}/${date[2]}/${date[0]}")
}