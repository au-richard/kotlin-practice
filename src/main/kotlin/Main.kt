val name = "Richard"
var greeting: String? = null
fun main(args: Array<String>) {
//    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}
    when (greeting) {
        null -> println("Hi")
        else -> println(greeting)
    }
    println(greeting)
    println(name)

}