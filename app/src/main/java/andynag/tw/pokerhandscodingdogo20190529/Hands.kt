package andynag.tw.pokerhandscodingdogo20190529

class Hands(val pokerList: List<Poker>) {

    fun result():String{
        return if(isFlush() && isStraight()){
            "StraightFlush"
        } else  if(isFlush()) {
            "Flush"
        } else {
            "Straight"
        }
    }

    private fun isFourOfAKind():Boolean {
        var dict = mutableMapOf<Int, Int>(
        )
        for (poker in pokerList) {
            if (dict[poker.point] == null) {
                dict[poker.point] = 1
            } else {
                dict[poker.point] = dict[poker.point]!! + 1
            }
        }

        return dict.any { it.value == 4 }
    }

    private fun isStraight():Boolean{
        if(pokerList.size>4) {
        pokerList.sortedBy { poker ->poker.point  }
            var pri=pokerList.first().point
        for(i in 1 until pokerList.size){
            pri++
            if(pokerList[i].point!=pri){
                return false
            }
        }
            return true
        }else {
            return false
        }
    }

    private fun isFlush(): Boolean {
        val pokerSuit = pokerList.distinctBy {
            it.suit
        }

        if (pokerSuit.size == 1) {
            return true

        }
        return false
    }
}
