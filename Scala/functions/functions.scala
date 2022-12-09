object functions {
  def main(args: Array[String]): Unit = { // Unit type is similar to Java's void

    exponent(2,5)

    callByValue(callBy())
    callByName(callBy())

    lambdaFunction

    higherOrderFunction(exponent)

    val power = higherOrderFunction // function overloading

    power(2,5)

    /**
     * A closure is a function, whose return value depends on the value of
     * one or more variables declared outside this function.
     */

    val PI: Double = 3.14
    val calculateCircumference = (radius: Double) => 2 * PI * radius
    calculateCircumference(5)

    voidFunction

    divide(10, 2)
  }

  private def exponent(base: Double = 1.0, power: Int = 0): Double = { // assign default values to the function parameters
    scala.math.pow(base, power)
  }

  private def callBy(): String = {
    println("Inside callBy()")
    "callBy" // return value
  }

  private def callByValue(functionName: String): Unit = {
    println("Inside callByValue")
    println("Print function name first time " + functionName)
    println("Print function name second time " + functionName)
  }

  private def callByName(functionName: => String): Unit = {
    println("Inside callByName")
    println("Print function name first time " + functionName)
    println("Print function name second time " + functionName)
  }

  private def lambdaFunction = {
    ((number: Int) => number % 2 == 0)(5)
    val isEven = (number: Int) => number % 2 == 0
    isEven(5)
    isEven.apply(5)
  }

  private def higherOrderFunction(function: (Double, Int) => Double): Unit = {
    /** A higher-order function is often defined as a function that:
     *     1. takes other functions as input parameters
     *  OR
     *     2. returns a function as a result
     */

    println(function(2, 5))
  }

  private def higherOrderFunction: (Double, Int) => Double = {
    exponent
  }

  private def voidFunction {
    println("This function will not return any value")
  }

  private def variableArguments(args: String*): Unit = { // variable length arguments
    println(args)
  }

  private def divide(dividend: Double, divisor: Double): (Double, Double) = {
    (dividend / divisor, dividend % divisor)
  }
}

functions.main(null)