fun main() {
    val nb = readln().toInt()
    println(when (nb){
        1 -> "move up"
        2 -> "move down"
        3 -> "move left"
        4 -> "right"
        else -> "error!"
    })
}
