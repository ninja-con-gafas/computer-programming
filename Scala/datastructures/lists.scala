val list = List(1.0, 2.0, 1, 2, 3, 4, 5, true, 'c')
println(list)
println(list.getClass)

val emptyList: List[Nothing] = List()
var vowels = List('a', 'e', 'i', 'o', 'u') // Elements of a list are immutable
vowels = 'a' :: 'e' :: 'i' :: 'o' :: 'u' :: Nil

val first10NaturalNumbers = List.range(1, 11)
val first10MultiplesOf3 = List.range(3, 33, 3)

var mergeList = first10NaturalNumbers ::: first10MultiplesOf3
mergeList = List.concat(first10NaturalNumbers, first10MultiplesOf3)

vowels.foreach(println)

for (vowel <- vowels)
  println(vowel)