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
}


// 
