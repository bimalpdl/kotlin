fun main () {
    // table of given number that loops till 10 iterations:
    println("Enter a number: ")
    val num = readln().toInt()
    println("Table of $num: ")
    for (i in 1..15){
        if ( i > 10){
            break                 // break exits the loop when specified condition is met.
        }
        println("$num x $i   =  ${i * num}")


    }

    // Multiplication table of given number with only even numbers :
    println("Table of $num with only even numbers: ")
    for(x in 1..20){
        if( x % 2 != 0 ) { continue }    // continue skips the loop when specified condition is met.
        println("$num x $x = ${num * x}")
    }
}