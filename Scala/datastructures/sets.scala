var set = Set('a', 'e', 'i', 'o', 'e', 'u')
set('0') // returns boolean value
set('o')
set += 0
set -= 0
val emptySet = Set()
emptySet.isEmpty
set ++ emptySet // adds two sets

set.head // returns first element of the set
set.tail // returns all the elements after the first element