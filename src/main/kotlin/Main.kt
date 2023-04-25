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
fun sayHello() {
    println(getGreeting())
}
fun main() {

//    println(greetingToPrint)
//    println(name)
    println(getGreeting())
    sayHello()
}