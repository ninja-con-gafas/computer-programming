var array: Array[Char] = new Array[Char](5)
for (i <- 0 until 5) array(i) = i.toChar

array = Array('a', 'e', 'i', 'o', 'u')
array.foreach(println)

array(0)
array.apply(0)

array(0) = 'A'
array.update(0, 'A')
