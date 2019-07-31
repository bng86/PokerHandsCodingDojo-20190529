package andynag.tw.pokerhandscodingdogo20190529

class Poker(private val input : String) {

    fun suit(): Suit {
        return when(input[0]) {
            'C' -> Suit.Clubs
            'D' -> Suit.Diamonds
            'H' -> Suit.Hearts
            'S'->Suit.Spades
            else -> TODO()
        }
    }

    fun point(): Int {
        return when (input[1]) {
            'A' -> 1
            'Q' -> 12
            'K' -> 13
            'J' ->11
            else -> input[1].toInt()
        }
    }

}
