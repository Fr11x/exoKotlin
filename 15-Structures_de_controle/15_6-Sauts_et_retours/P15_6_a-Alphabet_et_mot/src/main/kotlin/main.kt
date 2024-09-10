fun main() {
    val mot = readln()
    var result = ""
    for (i in 'a'..'z'){
        if (i in mot ){
            continue
        }
        result += i
    }
    println(result)
}
