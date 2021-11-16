fun main() {
    val ticket = readLine()!!
    val half1 = ticket.substring(0, ticket.length / 2)
    val half2 = ticket.substring(ticket.length / 2, ticket.length)
    var n1 = 0
    var n2 = 0
    for (i in half1) n1 += i.toString().toInt()
    for (i in half2) n2 += i.toString().toInt()
    if (n1 == n2) println("YES") else println("NO")
}