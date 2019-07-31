package andynag.tw.pokerhandscodingdogo20190529

class Poker(private val input : String) {

    fun suit(): Suit {
        return if(input[0] == Suit.Clubs.toString()[0]){
            Suit.Clubs
        }else{
            Suit.Diamonds
        }
    }

    fun point(): Int {
        return if(input[1]== 'A'){
            1
        }else{
            12
        }
    }

}
