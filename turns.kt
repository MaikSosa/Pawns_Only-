package chess

import chess.Participants.Companion.p1name

class Turns {

    fun gameLoop(): Int {
        while (true) {
            var currentPlayer = 1 // Start with player 1

            while (true) {
                val currentTurn = if (currentPlayer == 1) Participants.p1name else Participants.p2name
                println("$currentTurn's turn:")
                val input = readln()

                if (input == "exit") {
                    println("Bye!")
                    return 0
                } else if (currentPlayer == 1 && !InputChecker().checker1(input)) {
                    println("Invalid Input\n")
                    continue
                } else if (currentPlayer == 2 && !InputChecker().checker2(input)) {
                    println("Invalid Input\n")
                    continue
                }
                // Switch to the other player
                currentPlayer = 3 - currentPlayer // Alternates between 1 and 2
            }
        }
    return 1
    }
}
