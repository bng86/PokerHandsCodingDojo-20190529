package andynag.tw.pokerhandscodingdogo20190529

class Hands(val cards: List<Card>) {


    companion object{
        fun create(input:String):Hands{
            val cards = input.split(",").map {Card.create(it)  }
            return Hands(cards)
        }
    }


    fun getType(): Type {
        var suit:Suit = cards[0].suit
        if(cards.all { it.suit == suit  }){
            return Type.Flush
        } else {
            return Type.StraightFlush
        }
    }
}


enum class Type{
     Flush, StraightFlush
}