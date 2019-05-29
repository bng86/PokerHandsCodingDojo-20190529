package andynag.tw.pokerhandscodingdogo20190529

class Card(val suit: Suit,
           val number: Int) {

    companion object{
        fun create(input: String) : Card {
            val suit = input[0]
            val number =input.substring(1, input.length).toInt()

            return when(suit) {
                'H'-> Card(Suit.Hearts,number )
                'C'->Card(Suit.Clubs, number )
                else-> throw IllegalArgumentException()
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
    object Diamond: Suit()
}