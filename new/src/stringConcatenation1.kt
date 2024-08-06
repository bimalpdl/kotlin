fun main (args: Array<String>){
    print("Enter your name: ")
    val name : String = readln()
    val firstString : String = "Hello, $name!"
    val secondString : String = " How are you doing? "
    val isStudent: Boolean = true
    val thirdString: String = "Are you a student? "
    val result : String = firstString + secondString + "Hope you are doing well.\n"  // escape sequence is used i.e '\n'
    println(result)
    println( firstString + thirdString + isStudent)  /* other data types can also be concatenated to the string
    ( here boolean type is concatenated )
    */
    println("This is an example of string concatenation in Kotlin.")


}