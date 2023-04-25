class Person(val firstName: String = "Peter", val lastName: String = "Parker") {

  var nickname: String? = null
    set(value) {
      field = value
      println("the new nickname is $value")
    }
    get() {
      println("the return value is $field")
      return field
    }
  fun printInfo() {
    val nicknameToPrint = nickname ?: "no nickname"
    println("$firstName ($nickname) $lastName")
  }
}

