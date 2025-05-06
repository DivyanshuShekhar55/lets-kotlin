import java.text.NumberFormat

fun trytry() {

    // we have try, catch and optional finally blocks to use for error handling
    try {
        val inp = readln().toInt()

    } catch (e: NumberFormatException) {
        // we can also use an exact matching for errors
        println("couldn't convert to integer")

    } catch (e: Exception) {
        // if we pass error as Exception it will catch all errors there
        // this way we can handle errors rather than getting the program crashed
        println("can use multiple exception blocks")
    }

    // we can also throw errors using throw keyword
    // throw Exception("some sort of error message")
}