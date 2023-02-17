// Examples of IF statements in Kotlin
fun main() {
    val x = 10
    val y = 20

    // Simple IF statement
    if (x < y) {
        println("$x is less than $y")
    }

    // IF-ELSE statement
    if (x > y) {
        println("$x is greater than $y")
    } else {
        println("$x is less than or equal to $y")
    }

    // IF-ELSE-IF statement
    if (x > y) {
        println("$x is greater than $y")
    } else if (x == y) {
        println("$x is equal to $y")
    } else {
        println("$x is less than $y")
    }
}
