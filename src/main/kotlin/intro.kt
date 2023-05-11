//+	Addition	Adds together two values	x + y
//-	Subtraction	Subtracts one value from another	x - y
//*	Multiplication	Multiplies two values	x * y
///	Division	Divides one value from another	x / y
//%	Modulus	Returns the division remainder	x % y
//++	Increment	Increases the value by 1	++x
//--	Decrement	Decreases the value by 1	--x
fun main(args: Array<String>) {
    var name:String = "Drake"
    println(name)
    println("This is kotlin intro")
    println(name[0])
    println(name.indexOf(name))

    var number:Int = 3
    println(number)
//strings
    var firstname:String = "Drake"
    var secondname:String = "John"
    println("Your name is $firstname $secondname ")
// booleans
    var num1 : Int = 10
    var num2 : Int = 9
    println(num1 == num2) // returns false
    println(num1 != num2) // returns true

// if
    var numm1: Int= 5
    var numm2: Int= 5
    if (numm1 == numm2){
        println("both are equal")
    }
    else {
        println("Not equal")
    }
//end if

// when
    var day = 4
    var result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "invalid day"



    }
    println(result)




}