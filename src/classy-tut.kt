// Kotlin separates the primary constructor from its "init" func. (unlike classes in Python)
// Also Kotlin can have multiple secondary constructors
// and also multiple init blocks, which run in order of definition (but all inits run first)
// if we are using secondary constructor with primary need to delegate these secondary using the this keyword

class Person constructor(val name: String, var age: Int) {
    var hobby: String = ""

    constructor(name: String, age: Int, hobby: String) : this(name, age) {
        this.hobby = hobby
    }

    init {
        println("print from the first init")
    }
}

fun a() {
    val p = Person("hello", 12)
    p.age = 21 // this is the default setter
    println(p.age) // this is the default getter
}


// DEFINING CUSTOM GETTERS AND SETTERS
class hero constructor(val name: String, val power: String) {

    // val properties can only have a defined getter
    // each variable property can have both its getter and setter defined as followed
    // can have default values
    // then use the "field" to return the current value held by the property
    var extraPower: String = ""
        get() = field
        set(value) {
            println("can do something in this function")
            field = value
        }
}

fun customGetSet() {
    val ironMan = hero(name = "Tony Stark", power = "Flying Suit")
    ironMan.extraPower = "Laser Blast" // this calls our setter
    println(ironMan.extraPower) // calls our getter
}

