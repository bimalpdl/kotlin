// Using named argument, we can define that which argument to assign to particular parameter

// we can also change  the order of parameters while passing arguments regardless of how parameters are
// defined in function definition

fun main(){
println("Enter first number: ")
    val a = readln().toInt()
    println("Enter second number: ")
    val b = readln().toInt()
    val result = subtraction(num1 = a, num2 = b)  // we're instructing to assign 'a' to num1 and 'b' to num2
    val result1 = subtraction(num2 = a, num1 = b) //order of parameter is changed here
    println("$a - $b = $result ")
    println("$b - $a = $result1 ")


}

fun subtraction(num1 : Int, num2 : Int):Int {
    return num1 - num2
}