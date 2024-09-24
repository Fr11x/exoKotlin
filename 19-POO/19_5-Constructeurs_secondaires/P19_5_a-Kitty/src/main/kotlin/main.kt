class Kitty {
    var couleur:String =""
    var age:Int = 0
 constructor(color:String,age_: Int){
     couleur = color
     age = age_
 }
 constructor(age_: Int,color:String){
     age = age_
     couleur = color
 }
 constructor(color:String){
     couleur = color
 }
 constructor(age_: Int){
     age = age_
 }
}


fun main() {
    val garfield = Kitty("orange", 7)
    val tom = Kitty(8, "grey")
    val grominet = Kitty("black")
    val kitty = Kitty(3)

    println("Objet garfiel : \n\t - couleur : ${garfield.couleur}")

}