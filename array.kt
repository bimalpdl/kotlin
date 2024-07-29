import kotlin.collections.EmptyList.get

// arrayOf() function is used to declare Array in Kotlin
fun main(args: Array<String>){
    var arr = arrayOf(2,3,4)    // implicit declaration of array i.e data type of array is declared by compiler itself
    for (i in arr){
        println(i)
    }

    var arr1 = arrayOf<String>("Rohini", "Matrika", "Bimal")    // explicit declaration of array data type
    for (j in arr1) {
        println(j)
    }

    // get method is used to read array element from given element
    println(get(0))


}