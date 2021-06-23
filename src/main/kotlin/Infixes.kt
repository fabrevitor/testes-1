// o que é infix

class MyInfixTest{

    infix fun Int.testInfixFun(i:Int) = i + 10

    infix fun testInfixFun2(s:String) {
        println(s)
    }

    fun sumTest(){
        var test = 1 testInfixFun 2

        println(test)
    }

}


fun main() {
    println(MyInfixTest().sumTest())

    var mft = MyInfixTest()

    mft testInfixFun2 "a"
}
