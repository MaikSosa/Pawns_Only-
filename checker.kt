package chess

class InputChecker {
    val base_letters = arrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    val base_numbers = arrayOf('1', '2', '3', '4', '5', '6', '7', '8')

    fun checker1(p1turns: String): Boolean {
        if (p1turns.length != 4) {
            // Input should be exactly 4 characters (e.g., "e2e4")
            return false
        }
        val p1check = p1turns.toCharArray()

        val isValidStartLetter = base_letters.contains(p1check[0])
        val isValidStartNumber = base_numbers.contains(p1check[1])
        val isValidEndLetter = base_letters.contains(p1check[2])
        val isValidEndNumber = base_numbers.contains(p1check[3])

        return isValidStartLetter && isValidStartNumber && isValidEndLetter && isValidEndNumber
    }

    fun checker2(p2turns: String): Boolean {
        if (p2turns.length != 4) {
            // Input should be exactly 4 characters (e.g., "e2e4")
            return false
        }
        val p2check = p2turns.toCharArray()

        val isValidStartLetter = base_letters.contains(p2check[0])
        val isValidStartNumber = base_numbers.contains(p2check[1])
        val isValidEndLetter = base_letters.contains(p2check[2])
        val isValidEndNumber = base_numbers.contains(p2check[3])

        return isValidStartLetter && isValidStartNumber && isValidEndLetter && isValidEndNumber
    }
}
