import scala.io.StdIn.readInt

val GROUP_1_ELEMENTS = List("Li", "Na", "K", "Rb", "Cs", "Fr")

for (elements <- GROUP_1_ELEMENTS)
  println(elements)

for (elements <- GROUP_1_ELEMENTS if elements.length > 1)
  println(elements)

for (i <- 1 to 5)
  print(i + ", ")

for (i <- 1 to 5;
     j <- 1 to 10)
  print(i + 'x' + j + '=' + i*j)
  println

val SQUARE_OF_EVEN_NUMBERS = for (number <- 1 to 10; if number % 2 == 0)
  yield scala.math.pow(number, 2)
println(SQUARE_OF_EVEN_NUMBERS)

// create list of vector of odd and even numbers from 1 to 10

val PAIRS = for(number <- 1 until 11; if number % 2 == 0) yield(number - 1, number)

// sum each pair of number, similar to map function

for((element1, element2) <- PAIRS) yield element1 + element2

var elements = GROUP_1_ELEMENTS
while(elements.nonEmpty) {
  elements = elements.drop(1)
  println(elements)
}

var selection = 0
var result = ""

do {
  println("\nSelect:\n 1\n 2\n 3\n 4\n 5")
  selection = readInt()
  result = selection match {
    case 1 => "North"
    case 2 => "East"
    case 3 => "South"
    case 4 => "West"
    case 5 => "Exit"
    case _ => "Invalid choice"
  }
  println(result)
}while(!(selection == 5))