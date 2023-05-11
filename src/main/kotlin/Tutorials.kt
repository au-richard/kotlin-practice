import java.util.*
import kotlin.math.pow

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


//  Practicing Conditions
//  val x = 8
//  val y = 7
//  val z = if (x + y == 14) 3 else 4
//  if (x < y || y * y == 49) {
//    println("at least one of the conditions is true")
//  } else if (x > y) {
//      println("x is greater than y")
//  } else {
//      println("x is equal to y")
//  }

//  println("the value of z is $z")
//  val string = "callers"
//  if (string.reversed() == string) println("$string is a palindrome") else println("$string is not a palindrome")

//  Practicing Null Values and User Input
//  val userInput = readLine()
//  if (userInput != null) {
//    println(userInput.toInt() - 5)
//  }

//  println("Enter your age")
//  val age = readlnOrNull()?.toInt()
//  if (age != null) {
//    if (age in 18..65) {
//      println("You are an adult")
//    } else if (age > 65){
//      println("You are really old.")
//    } else {
//      println("You are not an adult yet.")
//    }
//  }


//  Practicing Arrays
//  val myArray = arrayOf("Hello", "Guys", "What's up?")
//  println(myArray[2])


//  Practicing While Loops
//  val myArray = arrayOf("Hello", "Guys", "What's up?")
//  val arrayLength = myArray.size
//  var i = 0
//  while (i < arrayLength) {
//    println(myArray[i])
//    i++
//  }

//  println("Please enter a number")
//  var userInput = readlnOrNull()?.toInt()
//  if (userInput != null) {
//    println("Counting down from $userInput to 0:")
//    while (userInput >= 0) {
//      println(userInput)
//      userInput--
//    }
//  }

//  println("Please enter a number.")
//  val num1 = readlnOrNull()?.toInt()
//  println("Please enter an exponent.")
//  val num2 = readlnOrNull()?.toInt()
//  if (num1 != null && num2 != null) {
//    val result = num1.toDouble().pow(num2)
//    println("$num1 to the power of $num2 is ${result.toInt()}")
//  }


//  Practicing For Loops
//  val myArray = arrayOf(1, 2, 3)
//  Range descending, every 2
//  for (i in 10 downTo 5 step 2) {
//    println(i)
//  }

//  Finding max value
//  val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
//  var max = myArray[0]
//  for (item in myArray) {
//    if (item > max) {
//      max = item
//    }
//  }
//  println(max)

//  val myArray = arrayOf(4, 5, 8, 9, 10, 2, 3)
//  var sum = 0
//  for (i in myArray) {
//    sum += i
//  }
//  println("The sum of the array is $sum")

//  println("Enter 5 numbers:")
//  var avg = 0.0
//  for (i in 1..5) {
//    var input = readln()?.toInt()
//    if (input != null) {
//      avg += input / 5.0
//    }
//  }
//  println("The average value is $avg")


//  Practicing Lists
//  val list = mutableListOf<Int>()
//  for (i in 1..5) {
//    val x = readlnOrNull()?.toInt()
//    if (x != null) {
//      list.add(x)
//    }
//  }
//  println(list.reversed())

//  Fibonacci Sequence
//  println("Enter a number n > 1")
//  val userInput = readlnOrNull()?.toInt()
//  val list = mutableListOf<Int>()
//  var num1 = 0
//  var num2 = 1
//  if (userInput != null && userInput > 1) {
//    for (i in 1..userInput) {
//      list.add(num1)
//      val sum = num1 + num2
//      num1 = num2
//      num2 = sum
//    }
//  }
//  println(list)


//  Practicing When

fun main() {
  println("Enter your age")
  val age = readLine()?.toInt()
  when(age) {
    in 0..5 -> println("You're a young kid")
    in 6..17 -> println("You're a teenager")
    18 -> println("Finally, you're 18!")
    19, 20 -> println("You're young adult")
    in 21..65 -> println("You're an adult")
    else -> println("You're really old")
  }
}
