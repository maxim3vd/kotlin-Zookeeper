fun main() {
    print("Please enter the number of the habitat you would like to view: ")
    val number = readln().toInt()
    println(habitats[number])
    println(
        """
        ---
        You've reached the end of the program. To check another habitat, please restart the watcher.
    """.trimIndent()
    )
}