fun main() {
    val nb = readln().toInt()
    val liste = mutableListOf<Int>()
    for (i in 1..nb){
        liste.add(readln().toInt())
    }
    val last: Int = liste.last()
    println(liste.count())
}
