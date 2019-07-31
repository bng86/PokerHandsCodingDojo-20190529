package andynag.tw.pokerhandscodingdogo20190529

class Hands(val pokerList: List<Poker>) {

    fun result():String{
        return if(isFlush() && isStraight()) "StraightFlush" else "Flush"
    }

    fun isStraight():Boolean{
        return true
    }

    fun isFlush(): Boolean {
        val pokerSuit = pokerList.distinctBy {
            it.suit
        }

        if (pokerSuit.size == 1) {
            return true

        }
        return false
    }
}
