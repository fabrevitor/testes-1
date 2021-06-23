import java.lang.NullPointerException

fun main() {


    val x: String? = null

    val z:String = x!!

    val y:String = x?:throw NullPointerException("Variável não pode ser nula sem o ?")

    println(y)

}