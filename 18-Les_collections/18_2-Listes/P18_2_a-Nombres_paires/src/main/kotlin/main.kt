fun main() {
    println( solution(listOf(8, 11, 3, 2)))
}

fun solution(numbers: List<Int>):List<Int> {
    var liste = mutableListOf<Int>()
    for (v in numbers){
        if (v % 2 == 0){
            liste.add(v)
        }
    }
    return liste
}

