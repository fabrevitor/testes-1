fun main(args: Array<String>) {

    val list1 = listOf(1,2,3)
    var list2 = listOf(1,2,3)
    var mList = mutableListOf(1,2,3)
    mList.add(4) // ok

    fun modifyList(list: MutableList<Int>) {
        list.add(1)
    }

    fun doSomeWorkWithList(list: List<Int>) {
        // ...
    }


//    mList = list1 // ? nao - mutableList herda de list
//    list1 = mList // ? nao - val
//    list2 = mList // ? sim
//    list2.add(5) // ? sim
//    modifyList(list2)
    doSomeWorkWithList(list2)
    doSomeWorkWithList(mList)

    println(list2)
    var i = 10
//     i = "hello" // V: nao (Estaticamente tipada)  R: sim (pq Kotlin é dinamicamente tipada)
    // StaticType ou DynamicType


    var n: Number = 10
    n = 1f

}