class LewisCarrollBook {
    var name:String = ""
    var author:String ="Lewis Carroll"
    var price:Int = 0
}


fun main() {
    val alicesAdventuresInWonderland = LewisCarrollBook()
    alicesAdventuresInWonderland.name = "Alice's Adventures in Wonderland"

    println(alicesAdventuresInWonderland.author)
    alicesAdventuresInWonderland.price = 10
}
