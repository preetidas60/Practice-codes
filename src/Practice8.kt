open class Robot(val name:String){
    init {
        println("A new robot is created")
    }
    open fun walk(){
        println("$name is walking now")
    }
    open fun talk(message : String){
        println("$name says: $message")
    }
}


class GenearalRobot(name: String) : Robot(name){
    fun turnOnLight(){
        println("The light is turned on")
    }
}

fun main(){
    val robot = GenearalRobot("Max")
    robot.walk()
}