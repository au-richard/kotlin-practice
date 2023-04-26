fun main() {
  val list = listOf("Kotlin", "Java", "C++", "JavaScript", null, null)
  val map = list
    .filterNotNull()
//    .filter {
//      it.startsWith(prefix = "J")
//    }
//    .map {
//      it.length
//    }

//    .take(n = 3)
//    .takeLast(n = 3)
    .associate { it to it.length }
//    .forEach {
//      println("${it.value}, ${it.key}")
//    }

//  How to rely on empty check instead of null check
  val language = list.filterNotNull().findLast { it.startsWith(prefix = "Java") }.orEmpty()
  println(language)
}