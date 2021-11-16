fun main() {
    val string = readLine()!!.split(" ").toMutableList()
    var longest = ""
    for (i in string) {
        if (i.length > longest.length) longest = i
    }
    println(longest)
}