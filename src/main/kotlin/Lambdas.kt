fun main() {

    // Lambda: (input arguments) -> OutputType
    val v1 = { str: String -> 10
        // do some work
    }
    val message = { print("Teste")}
    message()


    val contemCaracteresSuficientes: (String) -> Boolean = { it.length >= 6 }
    println(contemCaracteresSuficientes("Jefferson")) //Retorna true

    val startsWithA:(String) -> Boolean = {it.uppercase().startsWith("A")}

    println(startsWithA("aove"))

}