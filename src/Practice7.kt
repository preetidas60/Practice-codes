open class Phone(var isScreenLightOn: Boolean ){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var folded : Boolean) : Phone(isScreenLightOn = folded) {
    override fun switchOn() {
        if (!folded) {
            isScreenLightOn = true
        }
    }

    fun fold(){
       super.switchOn()
    }
    fun unFold(){
        super.switchOff()
    }
}

fun main(){
    val phoneStatus = FoldablePhone(false)
    phoneStatus.checkPhoneScreenLight()
    phoneStatus.switchOn()
    phoneStatus.checkPhoneScreenLight()
}