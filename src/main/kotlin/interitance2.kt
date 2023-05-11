open class Animal(colour:String, age:Int){
    init {
        println("Color is: $colour")
        println("Age is: $age")
    }
}
class Dog(colour: String, age: Int):Animal(colour, age){
    fun woof(){
        println("Dog makes sounds of wolfs")
    }
}
class Cat(colour: String, age: Int):Animal(colour, age){
    fun meow(){
        println("Cat makes sounds of meow")
    }
}

class Horse(colour: String, age: Int):Animal(colour, age){
    fun neigh(){
        println("Horses make sounds of neigh")
    }
}

fun main(args: Array<String>) {
    val d = Dog("Black", 4)
    d.woof()
    val c = Cat("white", 1)
    c.meow()
    val h = Horse("Brown", 8)
    h.neigh()
}