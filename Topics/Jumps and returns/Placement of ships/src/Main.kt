fun main() {
    val tab = mutableListOf(
        mutableListOf(0, 0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0, 0),
        mutableListOf(0, 0, 0, 0, 0),
    )
    var row = ""
    var col = ""
    val (a, b) = readLine()!!.split(" ")
    val (c, d) = readLine()!!.split(" ")
    val (e, f) = readLine()!!.split(" ")
    tab[a.toInt() - 1][b.toInt() - 1] = 1
    tab[c.toInt() - 1][d.toInt() - 1] = 1
    tab[e.toInt() - 1][f.toInt() - 1] = 1
    for (i in 0..4) {
        if (tab[i][0] == 0 && tab[i][1] == 0 && tab[i][2] == 0 && tab[i][3] == 0 && tab[i][4] == 0) row += "${i + 1} "
    }
    for (j in 0..4) {
        if (tab[0][j] == 0 && tab[1][j] == 0 && tab[2][j] == 0 && tab[3][j] == 0 && tab[4][j] == 0) col += "${j + 1} "
    }
    println(row.trim())
    println(col.trim())
}