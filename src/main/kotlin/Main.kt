//val name = "Richard"
//var greeting: String? = null

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
fun main() {
    sayHello(greeting = "Hey", itemToGreet = "Kotlin")
    sayHello(greeting = "Hello", itemToGreet = "World")

}