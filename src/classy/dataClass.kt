package classy

// data classes are classes that are only for storing data
// give auto generated func. like toString(), copy(), HashCode(), etc
// can override these func. according to needs (not all func are overridable)
// vars must be part of primary constructor

data class Person(val name: String, val Id: String){
    var age:Int=0 // is not available for auto generated func.
}

fun dataClassCaller(){
    val p1 = Person("John", "123")
    val p2 = Person("Josh", "236")

    println(p1) // print func
    val areSame = p1==p2 // compare operation
    println("p1 and p2 equality check : $areSame")

    val p3 = p1.copy(Id="231") // same name as p1 but different Ids
    println("p3 is $p3")
}