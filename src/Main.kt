//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    // vals are like const and vars are variables`
    // types can usually be auto-inferred
    var x = 5
    val y = 9
    x = 8

    // read a inp from the user
    // then convert to Int type, but say user passes "hello" return null
    // use the ?: to indicate that if no value take 0 as default
    // the ? works as null-checker and we can do multiple such things as above with it
    // if null the null needs be checked at each additional step
    println("Enter a number")
    val inp = readln()
    val modifiedInp = inp.toIntOrNull() ?: 0
    val multiNullChecks = inp.toIntOrNull()?.rem(5)?.equals(0)
    println("number is even ${modifiedInp % 2 == 0}")
    println("is divisible by 5 ?: $multiNullChecks")

    // conditionals()
    // arr()
    // loops()

    // FUNCTION TUTORIAL CALLERS :
    // funcACaller()
    // anotherFunCaller()
    // counterButtonCallerExample()
    // funcCallerExampleForHOFs()
    // extensionLambdaCaller()


    // CLASS CALLERS FROM HERE
    a()
}