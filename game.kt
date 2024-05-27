package chess

class Game {
    private val players = Participants()

    fun firstRound() {
        players.ask()
        board().print_board()
        Turns().gameLoop()

    }

}