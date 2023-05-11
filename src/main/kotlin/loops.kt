fun main(args: Array<String>) {
    //this is a for loop

    for (i in 5..12){
        println("loop : $i")
    }
    val myArray= arrayOf("ab", "be", "cd", "ef", "gh")
    for (word in myArray){
        println(word)
    }

    // this is a while loop
    var num = 10
    var num2 = 5
    var num3 = 100
    while (num >= 0){
        println("Loop1 : $num")
        num--
    }
    while (num2 >= 0){
        println("Loop2 : $num2")
        num2--
    }
    do {
        println("Loop3 : $num3" )
        num3++

    }while (num3 >= 105)




}