fun printFilteredStrings(list: List<String>, predicate: ((String) -> Boolean)?) {
  list.forEach {
    if (predicate?.invoke(it) == true) {
      println(it)
    }
  }
}

val predicate: (String) -> Boolean = {
  it.startsWith(prefix = "J")
}

fun getPrintPredicate(): (String) -> Boolean {
  return {it.startsWith(prefix = "J")}
}
fun main() {
  val list = listOf("Kotlin", "Java", "C++", "JavaScript")
  printFilteredStrings(list, getPrintPredicate())
  printFilteredStrings(list, predicate = null)
}