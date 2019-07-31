package andynag.tw.pokerhandscodingdogo20190529

import org.junit.Assert
import org.junit.Test

class PokeHandTest {

    @Test
    fun `test CA`() {
        val poker = Poker("CA")
        Assert.assertEquals(Suit.Clubs, poker.suit())
        Assert.assertEquals(1, poker.point())
    }
}