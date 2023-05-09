//import java.util.*
//import kotlin.math.pow
//  val x = 7
//val y = 7
//  var sphereRadius = 5.5
//  var sphereVolume = 0.75 * Math.PI * sphereRadius.pow(3.0)
//  val string = "richard"
//  println("The volume of the sphere is $sphereVolume")
//  println("Our string is: ${string.uppercase().reversed()}")
//  val numArr = arrayOf(1, 2, 3)
//  println(numArr.contentToString())

fun main() {
  val list = mutableListOf(1, 2, 3)
  list.remove(2)
  println(list)
  val string = "example string"
  println("this is a string: ${string.uppercase()}")
  val bool = true
  val x = 9
  val y = 3
  val z = 9
  val hardExpression = !(x != z ) && bool || z > (x + y) && (!bool || y < z)
  println(hardExpression)
}