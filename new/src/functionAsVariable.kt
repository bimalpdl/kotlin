fun main (args: Array<String>) {
    println("Enter first number: ")
    val firstNum = readln().toInt()
    println("Enter second number: ")
    val secondNum = readln().toInt()
// assigning 'add' function to variable 'function'
    var function = ::add
    var result = function(firstNum, secondNum)   //accessing 'add' function using 'function' variable
    println("The sum of $firstNum and $secondNum is $result")
}
/*
    function = :: power
    result = power(firstNum, secondNum)
    println("The power of $firstNum^$secondNum is $result")
}
*/

fun add(num1: Int , num2: Int): Int{
    return num1 + num2
}
/*
fun power(num1: Int, num2: Int):Int{
    return num1.pow(num2)
}

 */