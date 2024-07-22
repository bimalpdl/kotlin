fun main() {
    val number = 20
    val result = when(number){
        11-> "Eleven"
        12-> "Twelve"
        in 13..18 -> "Teen"
        else -> "Not a valid number"
    }
    println(result)
}