var map = Map(1 -> "One", 2 -> "Two", 3 -> "Three") // default Map class is immutable
map(1)
map += 4 -> "Four"
map.get(5) // graceful way to access a value assigned to a key, returns None if key not found
map.getOrElse(5, "Key not found")