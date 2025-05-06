fun conditionals() {

    // we have one extra feature of conditionals in kotlin
    // which is that we can give output from them (optional)
    var num = 1
    val output = if (num == 1) {
        "number is 1"
    } else if (num == 2) {
        "number is 2"
    } else {
        "number is not 1 or 2"
    }

    // we can use 'when' to perform switch cases in Kt
    val out = when {
        num == 1 -> "num is 1"
        num == 2 -> "num is 2"
        else -> {
            "num not 1 or 2"
            println("ya u can add more than one thing !!")
        }
    }

    // another cleaner way to do 'when'
    val out2 = when (num) {
        1 -> "ya its 1"
        else -> "not one"
    }

    println("$output and\n $out")
}

fun loops() {

    val some_list = mutableListOf<Int>(1, 2, 3, 4)
    // we have while and for as main loops
    var i = 0
    while (i <= some_list.lastIndex) {
        println(some_list[i])
        i++
    }

    // resetting value of i for the for loop example
    i = 0
    // use the '..' operator to denote the range operation
    for (i in 0..some_list.lastIndex) {
        println(some_list[i])
    }

    // we have one special loop for lists and arrays
    for (num in some_list) {
        println(num)
    }
}