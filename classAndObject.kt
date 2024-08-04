import kotlin.math.sin

fun main() {
    print("Enter car brand name: ")
    val name: String = readln()
    println()

    print("Enter car model: ")
    val model: String = readln()
    println()
    print("Enter total distance covered : ")
    val distanceCovered: Double = readln().toDouble()

    val car1 = Cars()
    car1.name = name
    car1.model = model
    car1.distanceCovered = distanceCovered
    val retunedValue  = car1.aboutCar()
    println(retunedValue)
}
// class declaration without constructor
class Cars{    // no parameter passed/assigned
    var name: String = ""
    var model: String = ""
    var distanceCovered: Double = 0.0
    fun aboutCar(): String {
        return "The car name is $name\nModel number = $model\nTotal distance covered = $distanceCovered"

    }
}