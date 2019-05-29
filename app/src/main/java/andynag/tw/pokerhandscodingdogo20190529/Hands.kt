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
//        cards.all { it is suit }
        return Type.Flush
    }
}

sealed class Type{
    object Flush:Type()
}