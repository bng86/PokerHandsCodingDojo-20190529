package andynag.tw.pokerhandscodingdogo20190529

class Card(val suit: String = "Hearts",
           val number: Int = 2) {

    companion object{
        fun create(input: String) : Card {
            val suit = input[0]
            val number =input.substring(1, input.length)

            when(suit) {

            }
            if(input.substring(0) == "H") {
                return Card("Hearts",2)
            }else{
                return Card("Clubs", 10)
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
    object Hearts
    object Clubs
}