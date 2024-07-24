// Function overloading
// It uses same name but different parameters
// Either number of parameters is different or type of parameter is different
fun main(){
    println("Addition function with Int type and two parameters.")
val result = addition (2,5)
    println(result.toString() + "\n")   //This is silliest this but I just wanna tryout if it works or not
    println("Addition function with Double type parameters.")
val result1 = addition (2.3,5.4)
    println(result1.toString() + "\n")
    println("Addition function with Int type and three parameters.")
    val result2 = addition(18,10,65)
    println(result2.toString()+"\n")
}

// Int type, two parameters
fun addition(num1 : Int, num2 : Int):Int {
    return num1 + num2
}

// Double type
fun addition(num1:Int, num2 : Int, num3 : Int): Int{
    return num1 + num2 + num3
}

// Int type, three parameters
fun addition(num1: Double, num2:Double): Double {
    return num1 + num2
}