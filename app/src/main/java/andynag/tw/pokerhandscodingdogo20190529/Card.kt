package andynag.tw.pokerhandscodingdogo20190529

class Card(val suit: String = "Hearts",
           val number: Int = 2) {

    companion object{
        fun create(input: String) : Card {
            if(input.substring(0) == "H") {
                return Card("Hearts",2)
            }else{
                return Card("Clubs", 10)
            }
        }
    }

}
