package andynag.tw.pokerhandscodingdogo20190529

class Hands(input: String) {
    init {
        val list = input.split(",")
        val cards= list.map { Card.create(it) }
    }

}
