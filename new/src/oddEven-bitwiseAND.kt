fun main (){
    println("Enter a number to check whether it's odd or even: ")
    val num = readln().toInt()
    if(num and  1 == 0 ){
        println("The number Even.")
    }
    else {
        println("The number is Odd")
    }


}