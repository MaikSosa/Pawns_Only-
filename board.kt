package chess

class board {
    private val board = Array(8) { row ->
        Array(8) { col ->
            val rank = row + 1
            when (rank) {
                2 -> Pawn.WHITE
                7 -> Pawn.BLACK
                else -> Pawn.NONE
            }
        }
    }

    companion object {
        val lines = "  +---+---+---+---+---+---+---+---+"
        val x_axis = "    a   b   c   d   e   f   g   h"
    }

    fun print_board() {
        val welcome = Participants()
        val stringBoard = board.mapIndexed { i, row ->
            val squares = row.joinToString(" | ") { pawn -> "${pawn.color}" }

            "$lines\n" +
            "${i + 1} | $squares |"
        }

        println(stringBoard.reversed().joinToString("\n"))
        println(lines)
        println(x_axis)
    }

    enum class Pawn(val color: Char) {
        BLACK('B'), WHITE('W'), NONE(' ')
    }
}