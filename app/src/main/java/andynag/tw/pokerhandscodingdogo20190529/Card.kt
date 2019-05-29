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
            val suit = input[0]
            val index = input.substring(1, input.length)
            val number = table[index]?:throw Exception()

            return when (suit) {
                'H' -> Card(Suit.Hearts, number)
                'C' -> Card(Suit.Clubs, number)
                'D' -> Card(Suit.Diamond, number)
                else -> throw IllegalArgumentException()
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

    object Clubs : Suit()
    object Diamond : Suit()
}