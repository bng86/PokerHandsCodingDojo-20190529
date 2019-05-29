package andynag.tw.pokerhandscodingdogo20190529

class Card(val suit: String = "Heart",
           val number: Int = 2) {

    companion object{
        fun create(input: String) : Card {
            return Card()
        }
    }

}
