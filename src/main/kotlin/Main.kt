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

//Key value pairs
val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")

//  sayHello(greeting = "Hey", itemToGreet = "Kotlin")
//  sayHello(greeting = "Hello", itemToGreet = "World")
//  map.put(4, "d")
//  map.forEach { (key, value) -> println("$key -> $value") }

fun sayHello(greeting: String, vararg itemsToGreet: String) {
  itemsToGreet.forEach { itemToGreet ->
    println("$greeting $itemToGreet")
  }
}

fun greetPerson(greeting: String = "Hello", name: String = "Kotlin") = println("$greeting $name")

fun main() {
//  val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
//  sayHello(itemsToGreet = interestingThings, greeting = "Hi")
//  val person = Person("Mike", "Johnson")
//  person.printInfo()
}
