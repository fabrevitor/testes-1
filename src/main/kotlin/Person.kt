sealed class Person{
    object x : Person() {

    }

    class PJ:Person(){}
    class PF:Person(){

    }

}


fun main() {
    var codigo:String = "x"

    var pessoa:Person = when (codigo) {
        "x" -> Person.PF()
        "y" -> Person.PJ()
        "z" -> Person.x
        else -> Person.PJ()

    }

    println(Person.x)


//    var teste = "String: " + when (pessoa){
//        is Person.PF -> "PF"
//        is Person.PJ -> "PJ"
//        else -> "Indef"
//    }



}