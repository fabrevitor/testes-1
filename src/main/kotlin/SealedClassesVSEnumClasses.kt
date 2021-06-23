// Qual a diferenca entre enum class with types e sealed class
sealed class MySealedClass(var varParamSC:Int){
    var varAttrib = varParamSC * 5


    fun funAlterValues(value:Int){
        varAttrib = value
        varParamSC = value
    }
}

class MyNormalClassExtSeal(varParamNC: Int): MySealedClass(varParamNC) {

}

class MyNormalClass(varParamNCNotExtends:Int){}

enum class PossibleLanguage(val exampleMessage:String){

    PT("Oi"),
    EN("Hello"),
    ES("Hola");

    fun printExample(){
        println(exampleMessage)
    }

}


enum class MyResultClass(var resultValue: Int, var error: Exception? = null) {
    FAILED(-1) {
        override val someValue = 1
    },
    SUCCESS(0) {
        override val someValue = 2
    };

    abstract val someValue: Int
    fun doWork() {}
}

sealed class MyResultSealed {

    fun doWork() {}
    abstract val someValue: Int

    data class Failed(val error: Exception): MyResultSealed() {
        override val someValue = 1
    }

    data class Success(val resultValue: Int): MyResultSealed() {
        override val someValue = 1
    }

    object Invalid: MyResultSealed() {
        override val someValue = 3
    }

}

fun getResult(): MyResultClass {
    TODO()
}

fun getResult2() : MyResultSealed {
//    return MyResultSealed.Failed(IllegalStateException("asd"))
//    return MyResultSealed.Success(999)
    return MyResultSealed.Invalid
}

fun main() {
    var test = MyNormalClassExtSeal(1)
    var test2 = MyNormalClass(1)



    println(test.varParamSC)
    println(test.varAttrib)

    test.funAlterValues(10)

    println(test.varParamSC)
    println(test.varAttrib)

    PossibleLanguage.EN.printExample()

    val result = MyResultClass.SUCCESS
    result.resultValue = 10

    val resultError = MyResultClass.FAILED
    resultError.error = IllegalStateException("some random fail")



}