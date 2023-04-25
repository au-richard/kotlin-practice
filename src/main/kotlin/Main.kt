val name = "Richard"
var greeting: String? = null
fun main() {
    val greetingToPrint = if (greeting != null) greeting else "Hi"
    println(greetingToPrint)
    println(name)
}