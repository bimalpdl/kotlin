fun main(args: Array<String>){
    val result : String = greet()
    println("Calling the function using variable name: \n$result")
    print(greet())


}
//if nothing is returned by a function, the return type will be 'unit' type

fun greet(): String {
    print("Enter your name: ")
    val name: String = readln()
    val firstString: String = "Hello $name!"
    val secondString: String = "How are you doing?"
    return "$firstString \n $secondString "
}