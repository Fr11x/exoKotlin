fun main() {
    println(solution(listOf(3, 2, 15)))
}

fun solution(numbers: List<Int>): Int {
    var res = 0
    for (v in numbers){
        res += v
    }
    return res
}