package andynag.tw.pokerhandscodingdogo20190529

import org.junit.Assert
import org.junit.Test

class CardTest {

    @Test
    fun `H2 suit should be Heart and number is 2`() {
        val input = "H2"
        val card = Card(input)

        Assert.assertEquals("Heart", card.suit)
        Assert.assertEquals(2, card.number)
    }

    @Test
    fun `C10 suit should be Clubs and number is 10`() {
        val input = "C10"
        val card = Card(input)

        Assert.assertEquals("Clubs", card.suit)
        Assert.assertEquals(10, card.number)
    }
}