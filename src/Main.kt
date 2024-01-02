
fun main() {

    val treatFunction = trickOrTreat(false)
        { "$it quarter" }
    val trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick
    } else {
        if(extraTreat != null){
            println(extraTreat(5))
        }
        return treat
    }
}

val trick = {
    println("No treats!")
}

val treat: ()->Unit = {
    println("Have a treat!")
}