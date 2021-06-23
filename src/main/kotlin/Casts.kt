

fun demo(x:Any){
    if(x is String) println(x.length)

    if(x !is String) println("Não é String!")
}



fun main() {

    demo(10)

}
