//val name = "Richard"
//var greeting = "Hello"
//
//greeting = "Hi"

//    greeting = "Hello"
//    val greetingToPrint = when (greeting) {
//        null -> "Hi"
//        else -> greeting
//    }
//    return greetingToPrint

//fun getGreeting(): String {
//    return "Hello Kotlin"
//}

//Single Expression Function Definition
fun getGreeting() = "Hello Kotlin"

//Unit in Kotlin = Absence of any useful type
fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")

val interestingThings = listOf("Kotlin", "Programming", "Comic Books")

//Key value pairs
val map = mapOf(1 to "a", 2 to "b", 3 to "c")


fun main() {
    sayHello(greeting = "Hey", itemToGreet = "Kotlin")
    sayHello(greeting = "Hello", itemToGreet = "World")
    map.forEach { (key, value) -> println("$key -> $value") }

}