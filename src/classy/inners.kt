package classy

// method one to define inner classes - directly use word "class"
// however inner classes cannot access values of outre class(es)
class Outer1 {
    private val i = 12

    class Inner1 {
        fun prt() {
            println("hey")
        }
    }
}

// method-2 to define inner classes with the keyword "inner"
// can access outer values
class Outer {
    private val i = 12

    inner class Inner {
        fun prt() {
            println("$i")
        }
    }
}

fun callerFun() {

    // if you are using method-1 then no need for an instance of outer class
    val a = Outer1.Inner1()
    a.prt()

    // for method-2 you need to first create the instance of outer class
    val b = Outer()
    val c = b.Inner()
    c.prt()


}
