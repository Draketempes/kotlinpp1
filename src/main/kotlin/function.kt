import kotlin.math.sqrt

fun main(args: Array<String>) {
    drake()
    math()
    choice()
    println(sqrt(x = 45.20))
    myFunction(fName = "Drake" , lName = "Tempes" , age = 12)
    myFunction(fName = "John" , lName = "Cambridge" , age = 34)
    myFunction(fName = "Sonia" , lName = "Bunny" , age = 8)


}
fun drake(){
    println("This is a function")
}
fun math(){
    val num=3
    val numA=11
    println("Sum of $num and $numA is ${num + numA}")
}
fun choice(){
    val numB = 5
    if(numB >= 0 )
        println("Number is a positive")
    else println("Number is a negative")

}
fun myFunction(fName:String,lName:String,age:Int){
    println("My name is $fName $lName and im $age years old ")
}
