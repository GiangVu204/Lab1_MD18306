package com.example.lab1_md18306


fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(tesscode())
    cases("hello")

    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(tesscode()))
}

fun cases(obj: Any) {
    when (obj) {                                        // 1
        1 -> println("One")                             // 2
        "Hello" -> println("Greeting")                  // 3
        is Long -> println("Long")                      // 4
        !is String -> println("Not a string")           // 5
        else -> println("Unknown \n")                   // 6
    }
}


fun whenAssign(obj: Any): Any {
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> "${42} \n"                              // 5
    }
    return result
}





class tesscode {
}