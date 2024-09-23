class City(val name: String) {
    var population: Int = 0
    init {
        population = if (population<0) 0 else if (population>50_000_000) 50_000_000 else population
    }
}

fun main() {
    val goodCity = City("Good City")
    val badCity = City("Bad City")

    badCity.population = 65_000_000
    println(badCity.population)

    goodCity.population = 45_000_000
    println(goodCity.population)
}