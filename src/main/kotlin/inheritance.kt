open class Parents{
    val mam="She likes cooking"
    val dad="He likes watching basketball"
}
class Boy:Parents(){
    fun kid1(){
        println(dad)
    }
}
class Girl:Parents(){
    fun kid2(){
        println(mam)
    }
}

fun main(args: Array<String>) {
    val sonObj=Boy()
    sonObj.kid1()

    val daughterObj=Girl()
    daughterObj.kid2()
}