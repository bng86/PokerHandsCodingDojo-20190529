package andynag.tw.pokerhandscodingdogo20190529

class Hands(val pokerList: List<Poker>) {
    fun isFlush(): String {


        val pokerSuit = pokerList.distinctBy {
            it.suit
        }

        if (pokerSuit.size == 1) {
            return "Flush"

        }


        return ""


    }
}
