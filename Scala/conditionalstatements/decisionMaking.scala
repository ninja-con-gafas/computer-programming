import scala.io.StdIn.readInt

/**
 * if statement
 * match statement
 */

println("Enter a number")
val number: Int = readInt
if(number % 2 == 0)
  println("Even")
else
  println("Odd")

println("Enter 1 to join the call\n Enter 0 to return to main menu")
val input: Int = readInt
val selection = input match {
  case 1 => "You are now joining the call."
  case 0 => "Please enter the conference ID followed by the # key."
  case _ => "Please enter a valid option"
}
println(selection)