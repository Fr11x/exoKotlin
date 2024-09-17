fun checkSpeed(speed:Int, limit:Int = 60):String {
    if (speed>limit){
        return "Exceeds the limit by ${speed-limit} kilometers per hour"
    }
    else{
        return "Within the limit"
    }
}

fun main() {
    println( checkSpeed(100, 60))
    checkSpeed(40, 90)
    checkSpeed(61)
    checkSpeed(60)
}