fun main() {
    println(solution(listOf("Fred", "Pola", "Mike", "Fred"), "Fred"))
}

fun solution(strings: List<String>, str: String): Int {
    var result = 0
    for (v in strings){
        if (str == v){
            result ++
        }
    }
    return result
}
