package andynag.tw.pokerhandscodingdogo20190529

class Poker(private val input : String) {

    val suit = suit()
    val point = point()

    private fun suit(): Suit {
        return when(input[0]) {
            'C' -> Suit.Clubs
            'D' -> Suit.Diamonds
            'H' -> Suit.Hearts
            'S'->Suit.Spades
            else -> TODO()
        }
    }

    private fun point(): Int {
        return when (val point =input.substring(1, input.length)) {
            "A" -> 1
            "Q" -> 12
            "K" -> 13
            "J" ->11
            else -> point.toInt()
        }
    }

}
