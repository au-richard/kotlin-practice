//import java.util.*
//import kotlin.math.pow

// Practicing Arithmetic Operators
//  val x = 7
//  val y = 7
//  var sphereRadius = 5.5
//  var sphereVolume = 0.75 * Math.PI * sphereRadius.pow(3.0)
//  println("The volume of the sphere is $sphereVolume")

// Practicing Template Literals
//  val string = "richard"
//  println("Our string is: ${string.uppercase().reversed()}")
//  println(numArr.contentToString())
//  val string = "richard"
//  println("this is a string: ${string.uppercase().reversed()}")

//  Testing structural vs referential equality
//  val bool = true
//  val x = 9
//  val y = 3
//  val z = 9
//  val hardExpression = !(x != z ) && bool || z > (x + y) && (!bool || y < z)
//  println(hardExpression)

//  Practicing Arrays and Lists
//  val numArr = arrayOf(1, 2, 3)
//  val list = mutableListOf(1, 2, 3)
//  list.remove(2)
//  println(list)
fun main() {
  val x = 5
  val y = 7
  if (x < y) println("x is less than y")
  println("this will always be executed")

  val string = "callers"
  if (string.reversed() == string) println("$string is a palindrome") else println("$string is not a palindrome")
}