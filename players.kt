package chess

class Participants {
    companion object {
        var p1name: String? = "NULL"
        var p2name: String? = "NULL"
    }

    fun ask(): String {
        println("First Player's name:")
        p1name = readln()
        println("Second Player's name:")
        p2name = readln()
        return p1name + p2name
    }
}