fun isVowel(letter: Char):Boolean = letter in (listOf('a','e','i','o','u','A','E','I','O','U'))
fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}
