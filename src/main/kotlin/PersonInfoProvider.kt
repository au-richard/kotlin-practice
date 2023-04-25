interface PersonInfoProvider {
  val providerInfo: String
  fun printInfo(person: Person) {
    println("basicInfoProvider")
    person.printInfo()
  }
}

class BasicInfoProvider : PersonInfoProvider {
  override val providerInfo: String
    get() = "BasicInfoProvider"

  override fun printInfo(person: Person) {
    super.printInfo(person)
    println("additional print statement")
  }
}

fun main() {
  val provider = BasicInfoProvider()
  provider.printInfo(Person())
}