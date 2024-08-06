fun main() {
    var number : Int = 5
    var result  = number in 1 until 5
    if(result){
        println("The number lies between 1 and 5")
    }
    else{
        println("The number doesn't lie between 1 and 5")
    }
}