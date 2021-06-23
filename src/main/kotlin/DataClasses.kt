data class MyClass(val v1: Int, val v2: String){
    var test = 20
}

fun main() {
    fun getDataClass(): MyClass {
        TODO()
    }

//    val data = getDataClass()
//    val v1 = data.v1
//    val v2 = data.v2
//    val (v1, v2) = getDataClass()
//    copy

    val m1 = MyClass(10, "hello")
    m1.test = 40

    val m2 = m1.copy(v2 = "hello")
    println("m1 = $m1")
    println("m2 = $m2")
    println(m1 == m2) // ?

    println("Print m2.test: ${m2.test}")



}