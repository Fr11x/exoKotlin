fun main() {
    val squirrels = readln().toInt()
    val nut = readln().toInt()
    val res = nut%squirrels
    if ( nut < 10000 || squirrels <10000){
        println(res)
    } else {
        println("nombre trop grand")
    }
}
