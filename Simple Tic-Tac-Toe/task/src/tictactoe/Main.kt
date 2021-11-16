package tictactoe

fun main() {
    val n = mutableListOf(
        mutableListOf('_', '_', '_'),
        mutableListOf('_', '_', '_'),
        mutableListOf('_', '_', '_')
    )
    val xxx = mutableListOf('X', 'X', 'X')
    val ooo = mutableListOf('O', 'O', 'O')
    val space = '_'
    var a: Int
    var b: Int
    var quit: Boolean
    var finish: Boolean
    var turn = 0
    val board = """
---------
| ${n[0][0]} ${n[0][1]} ${n[0][2]} |
| ${n[1][0]} ${n[1][1]} ${n[1][2]} |
| ${n[2][0]} ${n[2][1]} ${n[2][2]} |
---------"""
    println(board)

    do {
        finish = false
        
        do {                                            // X turn if 1, O if 2
            turn++
            quit = false
            println(if (turn % 2 != 0) "Enter the coordinates X:" else "Enter the coordinates O:")
            val (x, y) = readLine()!!.split(" ").map { it.toIntOrNull() }
            if (x == null || y == null) {
                println("You should enter numbers!")
                continue
            }
            if (x.toInt() !in 1..3 && x.toInt() in -100..100 || y.toInt() !in 1..3 && y.toInt() in -100..100) {
                println("Coordinates should be from 1 to 3!")
                continue
            }
            if (x.toInt() in 1..3 && y.toInt() in 1..3) {
                if (n[x.toInt() - 1][y.toInt() - 1] == space) {
                    quit = true
                    a = x.toInt()
                    b = y.toInt()
                    if (turn % 2 != 0) n[a - 1][b - 1] = 'X' else n[a - 1][b - 1] = 'O'

                } else println("This cell is occupied! Choose another one!")
            }
        } while (!quit)

        println("---------")
        println("| ${n[0][0]} ${n[0][1]} ${n[0][2]} |")
        println("| ${n[1][0]} ${n[1][1]} ${n[1][2]} |")
        println("| ${n[2][0]} ${n[2][1]} ${n[2][2]} |")
        println("---------")

        val line1 = mutableListOf(n[0][0], n[0][1], n[0][2])
        val line2 = mutableListOf(n[1][0], n[1][1], n[1][2])
        val line3 = mutableListOf(n[2][0], n[2][1], n[2][2])
        val row1 = mutableListOf(n[0][0], n[1][0], n[2][0])
        val row2 = mutableListOf(n[0][1], n[1][1], n[2][1])
        val row3 = mutableListOf(n[0][2], n[1][2], n[2][2])
        val diagonal1 = mutableListOf(n[0][0], n[1][1], n[2][2])
        val diagonal2 = mutableListOf(n[2][0], n[1][1], n[0][2])

        if (line1 == xxx || line2 == xxx || line3 == xxx || row1 == xxx || row2 == xxx || row3 == xxx || diagonal1 == xxx || diagonal2 == xxx) {
            println("X wins")
            finish = true
        }
        if (line1 == ooo || line2 == ooo || line3 == ooo || row1 == ooo || row2 == ooo || row3 == ooo || diagonal1 == ooo || diagonal2 == ooo) {
            println("O wins")
            finish = true
        }
        if (space != n[0][0] && space != n[0][1] && space != n[0][2] && space != n[1][0] && space != n[1][1] && space != n[1][2] && space != n[2][0] && space != n[2][1] &&
            space != n[2][2]
        ) {
            println("Draw")
            finish = true
        }

    } while (!finish)

}