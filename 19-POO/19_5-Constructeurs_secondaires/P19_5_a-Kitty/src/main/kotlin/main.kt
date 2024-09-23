class Kitty {
 constructor(color:String,age: Int)
 constructor(age: Int,color:String)
 constructor(color:String)
 constructor(age: Int)
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)
}