package andynag.tw.pokerhandscodingdogo20190529

class Card(val suit: String= "Hearts",
           val number: Int = 2) {

    companion object{
        fun create(input: String) : Card {
            val suit = input[0]
            val number =input.substring(1, input.length).toInt()

            return when(suit) {
                'H'-> Card("Hearts",number )
                'C'->Card("Clubs",number )
                else->Card("error",0)
            }
            if(input.substring(0) == "H") {
                return Card("Hearts",2)
            }else{
                return Card("Clubs", 10)
            }
        }
    }

}

enum class Suit {
    /*
     * Spade = 3
     * Heart = 2
     * Diamond = 1
     * Club = 0
     */
    Hearts, Clubs
}