class Mini(val name:String, val school:String, val year:Int){

}

fun main(args: Array<String>) {
    val obj=Mini("Drake", "Cambridge", 2022)


    println("My name is ${obj.name} i studied at ${obj.school} in the year ${obj.year}")
}