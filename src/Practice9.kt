fun main(){
    println("Enter the two numbers: ")
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    println("Division : ${operationOfAll(num1,num2){ x, y -> x/y}}")
    println("Remainder: ${operationOfAll(num1,num2){x,y-> x%y}}")
}

fun operationOfAll(a: Int, b: Int, operation:(Int,Int)->Int): Int{
    return operation(a,b)
}