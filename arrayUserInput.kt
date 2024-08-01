fun main () {
    println("Enter number of elements in array: ")
    val size : Int = readln().toInt()
    val array = IntArray(size)   // this is worst way to define array size(array size as variable), but I don't know why
    for (i in 0 until size){
        println("Enter ${ i + 1} element of the array")
        array[i] = readln().toInt()
    }
    println("Size of the array is:  " + array.size)
    println("The elements in the array are: ")
    for ((index,element) in array.withIndex()){    // prints array index along with element
        println("Index: $index : Element : $element")
    }
}