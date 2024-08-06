fun main() {
    val colors = arrayOf<String> ("Red", "Green", "Yellow", "Maroon", "Navy")
    for (i in colors ){
        println(i)
    }

    for (i in colors.indices) {
        print("Color at index $i : ")
        println(colors[i])
        println()
    }

    println("Colors at even indices are: ")
for (i in colors.indices){
    if (i % 2 == 0){
        println(colors[i])
    }
}
}