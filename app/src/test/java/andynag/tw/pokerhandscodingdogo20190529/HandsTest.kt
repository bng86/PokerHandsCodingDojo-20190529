package andynag.tw.pokerhandscodingdogo20190529

import org.junit.Assert
import org.junit.Ignore
import org.junit.Test

class HandsTest {
    /*
    CA,C2,C3,C4,C5 -> StraightFlush
CA,DA,HA,SA,C2 -> FourOfAKind
CA,DA,HA,C2,C2 -> FullHouse
CA,C3,C5,C7,C9 -> Flush
CA,D2,C3,C4,C5 -> Straight
CA,DA,HA,C2,C3 -> ThreeOfAKind
CA,DA,H3,C2,H2 -> TwoPair
CA,DA,H3,C4,H5 -> OnePair
CA,D3,C5,C7,C9 -> HighCard*/

    @Test
    fun `CA,C3,C5,C7,C9 should be Flush`() {
        val input = "CA,C3,C5,C7,C9"
        val hands = Hands.create(input)
        Assert.assertEquals(Type.Flush, hands.getType())
    }

    @Test
    fun `CA,DA,H3,C4,H5 should be Flush One Pair`(){
        val input = "CA,DA,H3,C4,H5"
        val hands = Hands.create(input)
        Assert.assertEquals(Type.OnePair, hands.getType())
    }


    @Test
    @Ignore
    fun `CA,C2,C3,C4,C5 should StraightFlush`() {
        val input = "CA,C2,C3,C4,C5"
        val hands = Hands.create(input)
        Assert.assertEquals(Type.StraightFlush, hands.getType())
    }
}