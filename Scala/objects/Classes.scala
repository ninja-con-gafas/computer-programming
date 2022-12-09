class Classes(val parameter1: Any, val parameter2: Any, val parameters: Any*) {
  override def toString: String = {
    super.toString
    f"parameter1 = $parameter1, parameter2 = $parameter2, parameters = $parameters"
  }
}

val ListOfObjects = List(new Classes(0, 1,2,3,4,5),
  new Classes('a', 'b', 'c', 'd', 'e'),
  new Classes(1.0, 2.0, 3.0, 4.0, 5.0),
  new Classes(true, false, "abcde")
)

ListOfObjects.foreach(println)