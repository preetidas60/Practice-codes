data class Question<T>(
    val questionText : String,
    val answer : T,
    val difficulty : Difficulty
)
enum class Difficulty{
    EASY, MEDIUM, HARD
}
fun main(){
    val question1 = Question<String>("cm of Assam","Himanta",Difficulty.MEDIUM)
    val question2 = Question<Boolean>("The sky is green",false,Difficulty.EASY)
    val question3 = Question<Int>("10/5",2,Difficulty.EASY)
    println(question1.toString())

}