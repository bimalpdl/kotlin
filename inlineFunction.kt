fun main() {
    // Square of given number
    println("Enter a number to find its square: ")
    val num = readln().toInt()
    val result = square( num )
    println ("The square of $num is $result" )


    // String concatenation
    println("Enter first string: ")
    val firstString = readln()
    println("Enter second string: ")
    val secondString = readln()
    val result2 = stringConcatenation(firstString, secondString)
    println(result2)
}


// Inline function
fun square(num : Int) = num * num

fun stringConcatenation(string1 : String, string2 : String ) = string1 + string2

//breakdown of above function:
/*
* Both of these function only contains a single expression,
* If a function only contains a single expression, we can write the function definition without using the definition block (curly braces) i.e {}
*
* Also, if a function contains only one expression, then we don't need to specify a return statement in inline function, just write the function definition and
* result will be returned automatically .
*
* If the return type is obvious i.e if all parameters are of same type and we are performing sth those parameters then it is obvious that it will return the type
* of same type as the passed parameter.
*
* In first function 'square' parameter type is Int and it is performing some operation on Int, so it is obvious that the resultant of operation using only Int
* also will be Int type.
*
* similarly  in function stringConcatenation, both of the parameters are string and function definition is only concatenating them. So, return type also will
* be String type.
*
*
* */
