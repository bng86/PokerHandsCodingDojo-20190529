package andynag.tw.pokerhandscodingdogo20190529

import org.junit.Assert
import org.junit.Test

class CardTest {

    @Test
    fun `H2 suit should be Heart and number is 2`() {
        val input = "H2"
        val card = Card.create(input)

        Assert.assertEquals(Suit.Hearts, card.suit)
        Assert.assertEquals(2, card.number)
    }

    @Test
    fun `C10 suit should be Clubs and number is 10`() {
        val input = "C10"
        val card = Card.create(input)

        Assert.assertEquals(Suit.Clubs, card.suit)
        Assert.assertEquals(10, card.number)
    }

    @Test
    fun `DQ suit should be Diamonds and number is 12`() {
        val input = "DQ"
        val card = Card.create(input)

        Assert.assertEquals(Suit.Diamond, card.suit)
        Assert.assertEquals(12, card.number)
    }
    @Test
    fun `SK suit should be Spade and number is 13`() {
        val input = "SK"
        val card = Card.create(input)

        Assert.assertEquals(Suit.Spade, card.suit)
        Assert.assertEquals(13, card.number)
    }
}