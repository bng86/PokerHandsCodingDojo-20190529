package andynag.tw.pokerhandscodingdogo20190529

class Hands(val cards: List<Card>) {


    companion object {
        fun create(input: String): Hands {
            val cards = input.split(",").map { Card.create(it) }
            return Hands(cards)
        }
    }


    fun getType(): Type {
        var suit: Suit = cards[0].suit
        val cardGroup = cards.groupBy {
            it.number

        }
        if (cards.all { it.suit == suit }) {
            return Type.Flush
        } else if (cardGroup.size == 4) {
            return Type.OnePair
        } else if (cardGroup.size == 3) {
            return if (cardGroup.any { it.value.size == 3 }) {
                Type.ThreeOfAKind
            }else {
                Type.TwoPair
            }
        } else if(cardGroup.size == 2) {
            return if(cardGroup.any { it.value.size == 4 }){
                return Type.FourOfAKind
            } else {
                throw  Exception()
            }

        } else {
            return Type.StraightFlush
        }
    }
}


enum class Type {
    Flush, StraightFlush, OnePair, TwoPair, ThreeOfAKind,
    FourOfAKind
}