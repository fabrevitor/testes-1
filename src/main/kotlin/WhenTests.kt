fun main() {
//    val x = 5
//
//    when (x) {
//        in 1..10 -> print("x is in the range")
////        in validNumbers -> print("x is valid")
//        !in 10..20 -> print("x is outside the range")
//        else -> print("none of the above")
//    }

    val setTest = mutableSetOf<Int>()

    setTest.add(10)
    setTest.add(25)
    setTest.add(10)

    val lastIndex = setTest.toList().lastIndex

    for(i in setTest.indices){
        println(setTest.toList()[i])
    }


}