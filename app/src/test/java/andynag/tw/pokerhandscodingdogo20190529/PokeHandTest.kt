package andynag.tw.pokerhandscodingdogo20190529

import org.junit.Assert
import org.junit.Test

class PokeHandTest {

    @Test
    fun `test CA`() {
        val poker = Poker("CA")
        Assert.assertEquals(Suit.Clubs, poker.suit)
        Assert.assertEquals(1, poker.point)
    }

    @Test
    fun `test DQ`() {
        val poker = Poker("DQ")
        Assert.assertEquals(Suit.Diamonds, poker.suit)
        Assert.assertEquals(12, poker.point)
    }

    @Test
    fun `test HK`() {
        val poker = Poker("HK")
        Assert.assertEquals(Suit.Hearts, poker.suit)
        Assert.assertEquals(13, poker.point)
    }

    @Test
    fun `test SJ`() {
        val poker = Poker("SJ")
        Assert.assertEquals(Suit.Spades, poker.suit)
        Assert.assertEquals(11, poker.point)
    }

    @Test
    fun testTwoToTenS() {
        val s = "S"
        for (i in 2..10) {
            val content = s + i.toString()
            val poker = Poker(content)
            Assert.assertEquals(Suit.Spades, poker.suit)
            Assert.assertEquals(i, poker.point)
        }
    }

    @Test
    fun `CA,C2,C3,C4,C5 Is flush`() {
        val list = ArrayList<Poker>()
        list.add(Poker("CA"))
        list.add(Poker("CJ"))
        list.add(Poker("C3"))
        list.add(Poker("C4"))
        list.add(Poker("C5"))
        val hands = Hands(list)

        Assert.assertEquals("Flush", hands.result())
    }

    @Test
    fun `CA,C2,C3,C4,C5  StraightFlush`() {
        val list = ArrayList<Poker>()
        list.add(Poker("CA"))
        list.add(Poker("C2"))
        list.add(Poker("C3"))
        list.add(Poker("C4"))
        list.add(Poker("C5"))
        val hands = Hands(list)

        Assert.assertEquals("StraightFlush", hands.result())
    }

    @Test
    fun `D9,D10,DQ,DK,DA Is flush`() {
        val list = ArrayList<Poker>()
        list.add(Poker("D9"))
        list.add(Poker("D10"))
        list.add(Poker("DQ"))
        list.add(Poker("DK"))
        list.add(Poker("DA"))
        val hands = Hands(list)

        Assert.assertEquals("Flush", hands.result())
    }

    @Test
    fun `H9,H10,HQ,HK,HA Is flush`() {
        val list = ArrayList<Poker>()
        list.add(Poker("H9"))
        list.add(Poker("H10"))
        list.add(Poker("HQ"))
        list.add(Poker("HK"))
        list.add(Poker("HA"))
        val hands = Hands(list)

        Assert.assertEquals("Flush", hands.result())
    }

    @Test
    fun `DA,H2,H3,H4,H5 Is Straight`() {
        val list = ArrayList<Poker>()
        list.add(Poker("DA"))
        list.add(Poker("H2"))
        list.add(Poker("H3"))
        list.add(Poker("H4"))
        list.add(Poker("H5"))
        val hands = Hands(list)

        Assert.assertEquals("Straight", hands.result())
    }
    @Test
    fun `D10,DJ,DQ,DK,DA Is Straight`() {
        val list = ArrayList<Poker>()
        list.add(Poker("DA"))
        list.add(Poker("H2"))
        list.add(Poker("H3"))
        list.add(Poker("H4"))
        list.add(Poker("H5"))
        val hands = Hands(list)

        Assert.assertEquals("Straight", hands.result())
    }
}