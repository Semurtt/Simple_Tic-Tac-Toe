fun main() {
    val char = readLine()!!.single()
    for (i in 'a'..'z') {
        if (i == char) return
        print(i)
    }
}