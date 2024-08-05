//The collection interfaces and related functions are located in the kotlin.collections package
// A collection usually contains a number of objects of the same type (and its subtypes).
// Objects in a collection are called elements or items.
package kotlin.collections

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun main() {

    // collection

// List is an ordered collection with access to elements by indices – integer numbers that reflect their position.
// Elements can occur more than once in a list

val numbers = listOf("One", "Two", "Three", 4, true)      // list containing different data type elements
    numbers.add("Five")
    for (i in numbers.indices)    // '.indices' will return the index number
        println(numbers[i])


        val stringList = listOf("one", "two", "one")
        printAll(stringList)


// Set is a collection of unique elements.
// It reflects the mathematical abstraction of set: a group of objects without repetitions.
// Generally, the order of set elements has no significance.
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}

//    Map (or dictionary) is a set of key-value pairs.
//    Keys are unique, and each of them maps to exactly one value. The values can be duplicates

    // Collection , list, set and maps are immutable by default, but can be made mutable

}