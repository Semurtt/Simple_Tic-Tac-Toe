fun main() {
    val url = readLine()!!.split("?").drop(1).joinToString().split("&")
    var password = ""
    for (i in url) {
        val (key, value) = i.split("=")
        if (key == "pass") password = value
        if (value.isNotEmpty()) println("$key : $value") else println("$key : not found")
    }
    if (password != "") println("password : $password")
}