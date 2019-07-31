package com.kotlin

fun main(args: Array<String>) {
    val box3 = Box3()
    val box5 = Box5()

    val list = ArrayList<Box>()
    list.add(box3)
    list.add(box5)

    print("Please enter object's length : ")
    val length = readLine()!!.toFloat()
    print("Please enter object's width : ")
    val width = readLine()!!.toFloat()
    print("Please enter object's height : ")
    val height = readLine()!!.toFloat()

    var isMatch = false

    for (box in list) {
        if (box.validate(length, width, height)) {
            println(box.name)
            isMatch = true

            break
        }
    }

    if (isMatch == false) {
        println("No suitable mailbox for you")
    }
}

