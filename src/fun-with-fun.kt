// can pass parameters to functions and return values
// also can give default vals to functions
fun functionA(
    someName: String,
    someGreeting: String = "Hello"
)
        : String {
    return "$someGreeting, $someName"
}


// following function is called OVERLOADING, because it has same name as prev func
// but its behaviour depends on the parameters provided
fun functionA(
    someName: String,
    someInteger: Int
)
        : String {
    return "hello i am $someName and my id is $someInteger"
}


fun funcACaller() {

    var returnedVal = functionA(someName = "Groot", someGreeting = "Namaste")
    //returnedVal = functionA(someName = "Bond", someInteger = 7)
    println(returnedVal)
}


// following is called FUNCTION EXTENSION
// can be applied to any object like strings, arrays, integers
// do something like str.reverse() or num.square() and not like square(num)
fun Int.square(): Int {
    // this refers to the Integer val upon which we are calling the square func
    return this * this
}

fun anotherFunCaller() {
    val x = 5
    val y = x.square()
    println("square of x is $y")
}


// LAMBDA FUNCTIONS :
// functions are stored as variables
// main idea is that these can be passed to other higher order functions
// the input parameters can even be unnamed like Int, String
// in the body the names are auto-inferred like event is given type String
// The return must be present, if none write Unit as return
val onClick: (incr: Int, String) -> Int =
    { incr, event ->
        println("event occurred $event")
        incr // last value in lambda are return, no need to use word "return"
    }

// HIGHER ORDER FUNCTIONS
// these accept or/and return a function as input/output
// the input function is having a name (as usual parameters do have) and the signature of the function
// accept inline func or lambda or anonymous func.
fun clickCounter(
    clickHandler: (Int, String) -> Int,
    somePrintMsg: String
)
        : Int {
    println("Some random message $somePrintMsg")
    var counter = 0
    counter += clickHandler(1, "pressDown")
    return counter
}

fun counterButtonCallerExample() {
    println(clickCounter(onClick, "Hello World"))
}


// TRAILING LAMBDAS
// if we have a single parameter we can simplify the expression using 'it' keyword
// val incr: (Int) -> Int = { num -> num + 1 }, rather than this do following :
val incr = { it: Int -> it + 1 }
// we call the above like incr(5) and returns 6


// BUILT-IN HIGHER ORDER FUNCTIONS
fun funcCallerExampleForHOFs() {
    val mylist = mutableListOf<Int>(1, 2, 3, 4)
    // filter returns all those values that give 'true' condition
    val outList = mylist.filter { incr(it) < 5 }
    println(outList) // returns [1, 2, 3]
}


// EXTENSION FUNCTIONS WITH LAMBDA
// extension functions that can also be used as lambdas
val extensionLambda: String.(Int) -> Unit = { repeat ->
    for (i in 0..repeat) {
        println(this) // this is what comes before the '.' so here the String
    }
}

fun extensionLambdaCaller() {
    val str = "Yo"
    str.extensionLambda(5)
}

