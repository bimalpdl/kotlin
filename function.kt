fun main (){
    println("Enter the first number: ")
    val num1 = readln().toInt()
    println("Enter the second number: ")
    val num2 = readln().toInt()
val result = sum(num1,num2)   // arguments are those values which are passed when calling the function,
    //argument is the actual value that is passed to the function or method when it is called
    println("The  sum of $num1 and $num2 is  $result")

    println("Enter a number of find if it's even or odd")
    val num3 = readln().toInt()
    isEven(num3)
    isEven()
}
//Normal function
fun sum (num1 : Int , num2 : Int):Int { // parameter is a variable named in the function or method definition, they act as placeholder
    // parameters are of 'val' type so they can't be reassigned
    //i.e num1 = 10 will throw an error since it's value is already assigned while calling the function
    val result = num1 + num2
    return result
}


// Function with default value
fun isEven(num1 : Int = 15) {
    val result = if(num1 % 2 ==0 ) "The number $num1 is Even" else "The number $num1 is odd" //If as an expression
    println(result)

}
