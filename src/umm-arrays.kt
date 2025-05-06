fun arr() {

    // we can create arrays using the following
    // arrays are immutable
    val arr1 = intArrayOf(1, 2, 3, 4, 5)

    println(arr1.size)
    println(arr1[2])
    println(arr1.contentToString())

    // we can have a list to modify items
    val list1 = mutableListOf<Int>(1, 2, 3, 4)
    list1.add(8)
    println(list1)
    println(list1.lastIndex)
}
