package chess

class Game {
    private val players = Participants()
    private val moves = InputChecker()

    fun firstRound() {
        players.ask()
        board().print_board()
        Turns().gameLoop()

    }

}