fun main (args: Array<String>){
    val num : Double = 12.5
    val num1 : Double = 14.8
    val num2 : Double = 10.89
    val total : Double = num + num1 + num2
    println("The total remaining distance to the destination is : $total \n" +    // string concatenation
            "The equation can also can be written as ${num + num1 + num2}" )    // ${} is used to evaluate the expression inside {}
}