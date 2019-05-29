package andynag.tw.pokerhandscodingdogo20190529

class Hands(private val cards: List<Card>) {


    companion object {
        fun create(input: String): Hands {
            val cards = input.split(",").map { Card.create(it) }
            return Hands(cards)
        }
    }


    fun getType(): Type {
        val suit: Suit = cards[0].suit
        val cardGroup = cards.groupBy {
            it.number

        }
        return when {
            cards.all { it.suit == suit } -> Type.Flush
            cardGroup.size == 4 -> Type.OnePair
            cardGroup.size == 3 -> if (cardGroup.any { it.value.size == 3 }) {
                Type.ThreeOfAKind
            } else {
                Type.TwoPair
            }
            cardGroup.size == 2 -> if (cardGroup.any { it.value.size == 4 }) {
                Type.FourOfAKind
            } else {
                Type.FullHouse
            }
            isStraight() -> {
                Type.Straight
            }
            else -> Type.StraightFlush
        }
    }

    private fun isStraight(): Boolean {
        //TODO: 10 J Q K A is not implemented
        val isDifferent = cards.groupBy { it.number }.size == 5
        if (isDifferent) {
            val sortedCards = cards.sortedBy { it.number }
            return Math.abs(sortedCards.first().number - sortedCards.last().number) == 4
        } else {
            return false
        }
    }
}


enum class Type {
    Flush, StraightFlush, OnePair, TwoPair, ThreeOfAKind,
    FourOfAKind, FullHouse, Straight
}