fun main() {
    do {
        print("Please enter the number of the habitat you would like to view: ")
        val habitat = readln()
        
        if (habitat != "exit") {
            val number = habitat.toInt()
            println(habitats[number])
        }
    } while (habitat != "exit")

    println(
        """
        ---
        You've reached the end of the program. To check another habitat, please restart the watcher.
    """.trimIndent()
    )
}