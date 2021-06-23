import kotlin.properties.Delegates

// DELEGATION BY -> CLASSES

interface Base {
    fun printMe() //abstract method
}
class BaseImpl(val x: Int) : Base {
    override fun printMe() { println(x) }   //implementation of the method
}
class Derived(b: Base) : Base by b  // delegating the public method on the object b

// DELEGATION BY - PROPERTIES

class StudentHeavy{
    init{
        println("Student Heavy initialized.........")
    }
}

class Student{
    val heavy by lazy {
        StudentHeavy()
    }

    var marks:Int by Delegates.observable(50){
            property, oldValue, newValue -> println("$property -> Old value: $oldValue -- New value: $newValue ")
    }

    var age: Int by Delegates.vetoable(24){property, oldValue, newValue ->
        println("$property -> Old value: $oldValue -- New value: $newValue ")
        newValue >= 18
    }
}



fun main() {

    // CLASS
    val test = BaseImpl(10)
    Derived(test).printMe() // prints 10 :: accessing the printMe() method

    // PROPERTY
    val student = Student()

    student.heavy // só é instanciado a StudentHeavy quando usamos a val heavy de Student, por conta do Lazy!

    student.marks = 70 // observable, quand é alterado, o observable executa o lambda.

    student.age = 13 // vetoable
    println("Age Student: ${student.age}") //Só altera o dado quando a condição for true!
}

