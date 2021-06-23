//private data class MyObjectClass(val i: Int)




class MyClassObjectsTest{

    object APIConstants {
        val baseUrl: String = "http://www.myapi.com/"

        fun funTestObj(){
            println("Funtion Object")
        }
    }

    companion object{
        val baseURLCO:String = "www.newapi.com"


        fun funTestCompObj(){
            println("Function Comp Object")
        }
    }

}


//object InPulseInfo {
//    init {
//        println("iniciando inpulse info")
//    }
//    val CNPJ = "cnpj"
//    val adress = "Rua asdkljasd"
//
//    fun testObject(){
//        println("teste!!!!")
//    }
//}

fun main() {
//    println("iniciando main")
//    println("inpulse cnpj:  ${InPulseInfo.CNPJ}")


//    val testClass = MyClassObjectsTest()

//    println(MyClassObjectsTest.APIConstants.baseUrl)
//    println(MyClassObjectsTest.baseURLCO)

    MyClassObjectsTest.APIConstants.funTestObj()

    MyClassObjectsTest.funTestCompObj()
    MyClassObjectsTest.baseURLCO



}