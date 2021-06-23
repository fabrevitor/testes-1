
data class Manager(val name:String)

interface MyArray<T>{
    fun addItem(item:T)
    fun removeItem(item:T)
}

class MyArrayImpl<T>:MyArray<T>{

    var items = arrayListOf<T>()

    override fun addItem(item: T) {
        items.add(item)
    }

    override fun removeItem(item: T) {
        items.remove(item)
    }

}

fun main() {
    val names = arrayListOf<String>()
    val managers = arrayListOf<Manager>(Manager("Vitor"), Manager("Rodrigo"))


    val myList = MyArrayImpl<Manager>()
    myList.addItem(Manager("Teste 1"))
    myList.addItem(Manager("Teste 2"))

    myList.removeItem(myList.items[1])

    val myList2 = MyArrayImpl<String>()

    myList2.addItem("Teste")
    myList2.addItem("Teste2")
    myList2.addItem("Teste3")

    myList2.removeItem(myList2.items[1])


//    println(myList.items[1])

//    myList.removeItem()




}