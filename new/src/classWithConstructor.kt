// class and objects in kotlin
fun main() {
    print("Enter number of entries you wanna make: ")
    val numOfEntries: Int= readln().toInt()
    for (i in 0 until numOfEntries) {
        println("Enter your name: ")
        val name: String = readln()
        println("Enter your age: ")
        val age: Int = readln().toInt()
        println("Are you an student? ( yes | no )")
        val choice: String = readln()
        val isStudent: Boolean = if(choice == "yes") true else false
        println("You are student? $isStudent")

        println()
       val person =  Person(name,age,isStudent)
        println(person.name)    // accessing class properties
        person.greet()    // accessing class methods
    }

}
 // defining class is similar to defining a function; 'class' keyword is used
class Person(val name: String, val age: Int, val isStudent: Boolean ) {    // class properties
    fun greet() {    // class method
        println("Hello, $name ! How are you doing?")
        val response: String = readln()
        when(response) {
            "Good" -> println("Glad to hear that. Have a good day!")
            "Bad" -> println("You'll be alright. Have a good day! ")
            else -> println("You might have entered wrong choice, please enter good or bad.")
        }
        println("So you're $age years old huh?\n")
        if(isStudent){
            println("Best of luck for the next exam pal.")
        }
        else{
            println("Have a good luck finding a job.")
        }


    }

}