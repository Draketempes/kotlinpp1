fun main(args: Array<String>) {

    print("Enter first number: ")
    val num1 = readLine()?.toDouble()?:0.0

    print("Enter operator (+,-,*,/): ")
    val op = readln()

    print("Enter second number: ")
    val num2 = readLine()?.toDouble()?:0.0

    val answer = when(op){
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else ->{
            println("Invalid Operator")
            0.0
        }
    }
    println(answer)

}