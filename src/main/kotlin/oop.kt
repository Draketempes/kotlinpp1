class Stubborn{
    private var number = 31
    fun calculate():Int {
        return number * number

    }
}

fun main(args: Array<String>) {
    val myObj = Stubborn()
    println(myObj.calculate())
}