package andynag.tw.pokerhandscodingdogo20190529

class Card(
    val suit: Suit,
    val number: Int
) {

    companion object {

        val table = hashMapOf(
            "2" to 2,
            "3" to 3,
            "4" to 4,
            "5" to 5,
            "6" to 6,
            "7" to 7,
            "8" to 8,
            "9" to 9,
            "10" to 10,
            "J" to 11,
            "Q" to 12,
            "K" to 13,
            "A" to 14
        )

        fun create(input: String): Card {
            val suit = parseSiut(input[0])
            val tail = input.substring(1, input.length)
            val number = parseNumber(tail)

            return Card(suit, number)
        }

        fun parseSiut(char: Char): Suit {
            return when (char) {
                'H' -> Suit.Hearts
                'C' -> Suit.Clubs
                'D' -> Suit.Diamond
                'S' -> Suit.Spade
                else -> throw IllegalArgumentException()
            }
        }

        fun parseNumber(str: String): Int {
            return try {
                str.toInt()
            }
            catch (_: NumberFormatException) {
                when (str) {
                    "A" -> 1
                    "J" -> 11
                    "Q" -> 12
                    "K" -> 13
                    else -> throw IllegalArgumentException()
                }
            }
        }
    }

}

sealed class Suit() {
    /*
     * Spade = 3
     * Heart = 2
     * Diamond = 1
     * Club = 0
     */
    object Hearts : Suit()
    object Spade : Suit()
    object Clubs : Suit()
    object Diamond : Suit()
}