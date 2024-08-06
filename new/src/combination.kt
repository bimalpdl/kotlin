fun main(){
    println("Enter a number to find it's factorial: ")
    val num = readln().toInt()
    val result = factorial(num)
    println("The factorial of $num is $result.")
}

fun factorial(number: Int): Int {
    var i: Int = 1
    var result: Int = 1
    while ( i <= number ){
        result = result * i
        i += 1
    }
    return result
}