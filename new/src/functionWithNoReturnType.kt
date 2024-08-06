fun main (){
println("Enter your name: ")
    val naam = readln()
    greet(naam)
    greet()

    abhiwadan(naam)
    abhiwadan()
}

fun greet(name: String = "Bimal"):Unit {   //default value of name = Bimal
    println("Hello $name, How are you Doing?")
}
// If a function doesn't return anything then it's return type will be 'Unit' type (as we defined/mentioned above)
fun abhiwadan (name: String = "Rohini") {
    println("Namaste $name, K xa hajur ko haalkhabar?")
}
//We don't need to explicitly define 'Unit' type if a function doesn't return anything, the compiler will auto-assign 'Unit' type,
// Explicitly defining 'Unit' type makes it redundant



