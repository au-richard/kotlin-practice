import java.util.*
import kotlin.math.pow
  var sphereRadius = 5.5
  var sphereVolume = 0.75 * Math.PI * sphereRadius.pow(3.0)
  val string = "richard"

fun main() {

  println("The volume of the sphere is $sphereVolume")
  println("Our string is: ${string.uppercase().reversed()}")
}