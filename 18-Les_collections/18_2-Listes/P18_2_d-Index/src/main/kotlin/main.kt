fun main() {
    println(solution(listOf("Mustard", "Cheese", "Eggs", "Cola", "Eggs"), "Eggs"))
}

fun solution(products: List<String>, product: String): List<Int> {
    val liste = mutableListOf<Int>()
    for (i in products.indices){
        if (products[i] == product){
            liste.add(i)
        }
    }
    return liste
}
