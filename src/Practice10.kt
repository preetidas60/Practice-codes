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
fun main(){
    println("${Quiz.answered} of ${Quiz.total} answered")
}