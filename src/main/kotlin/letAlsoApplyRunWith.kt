fun main() {
    var value = 10


    value.also {
        value = 15
        it.plus(1)
        println(it)
    }



//    val original = "abc"
//    // Evolua o valor e envie para a próxima cadeia
//    original.let {
//        println("A string original é $it") // "abc"
//        it.reversed() // evolve it as parameter to send to next let
//    }.let {
//        println("A string reversa é $it") // "cba"
//        it.length  // pode evoluir para outro tipo
//    }.let {
//        println("O comprimento da corda é $it") // 3
//    }
//
//// Rrrado
//// O mesmo valor é enviado na cadeia (a resposta impressa está errada)
//    original.also {
//        println("A string original é$it") // "abc"
//        it.reversed() // mesmo que o evoluamos, é inútil
//    }.also {
//        println("A string reversa é ${it}") // "abc"
//        it.length  // mesmo que o evoluamos, é inútil
//    }.also {
//        println("O comprimento da corda é ${it}") // "abc"
//    }
//
//// Corrigido para também (ou seja, manipular como string original
//// O mesmo valor é enviado na cadeia
//    original.also {
//        println("A string original é $it") // "abc"
//    }.also {
//        println("A string reversa é ${it.reversed()}") // "cba"
//    }.also {
//        println("The length of the String is ${it.length}") // 3
//    }

}
