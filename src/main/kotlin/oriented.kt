class Students(var name:String, var gender:String){

}

fun main(args: Array<String>) {
    var obj=Students("dan", "male")
    var obj2=Students("ben", "male")
    var obj3=Students("bree", "female")
    var obj4=Students("keila", "female")

    println("My name is ${obj.name} and im a ${obj.gender}" )
    println("My name is ${obj2.name} and im a ${obj2.gender}" )
    println("My name is ${obj3.name} and im a ${obj3.gender}" )
    println("My name is ${obj4.name} and im a ${obj4.gender}" )

}