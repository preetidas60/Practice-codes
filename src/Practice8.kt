fun main(){
    val students = mutableListOf("Preeti","Ridhima","Nisha")

    students.add("Riya")
    students.removeAt(2)
    students[2]="Tanvi"
    for(numbers in students){
        println(numbers)
    }
}