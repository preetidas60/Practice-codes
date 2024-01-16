data class Question<T>(
    val questionText : String,
    val answer : T,
    val difficulty : Difficulty
)
enum class Difficulty{
    EASY, MEDIUM, HARD
}
class Quiz{
    val question1 = Question<String>("cm of Assam","Himanta",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green",false,Difficulty.EASY)
    val question3 = Question<Int>("10/5",2,Difficulty.EASY)
    companion object StudentProgress{
        var total : Int = 10
        var answered : Int = 3
    }
}

val Quiz.StudentProgress.progressText : String
    get() = "${answered} of ${total} answered"

fun Quiz.StudentProgress.printProgressBar() {
    repeat(Quiz.answered) { print("▓") }
    repeat(Quiz.total - Quiz.answered) { print("▒") }
    println()
    println(Quiz.progressText)
}

fun main(){
    Quiz.printProgressBar()
}