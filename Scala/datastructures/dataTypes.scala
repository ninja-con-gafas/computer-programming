/**
 * Scala Type Hierarch:
 * Any
 *  AnyVal
 *    Double
 *    Float
 *    Long
 *    Int
 *    Short
 *    Byte
 *    Unit
 *    Boolean
 *    Char
 *      Nothing (sub type of all the types, also called the bottom type)
 *  AnyRef (java.lang.Object)
 *    List
 *    Option
 *    YourClass
 *      Null (sub type of reference types, had single value null which is also a keyword)
 */

var fraction = 4.5
println(fraction)
fraction = 4
println(fraction)

val Flag: Boolean = false
println(f"Value of Flag is $Flag")