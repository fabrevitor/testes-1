

class ClassTests(name:String, yearOfBirth:Int){
    lateinit var lateString: String
    var age = 0

    init {
        age = 2021 - yearOfBirth
    }
}

fun main() {
    val c:ClassTests = ClassTests("Vitor", 1997)

    c.lateString = "Teste"

    println(c.lateString)
    println(c.age)

}