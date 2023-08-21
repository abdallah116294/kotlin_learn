fun main() {
    val input = readln()
    val rows=input.toUIntOrNull()
    for (i in 1..rows!!.toInt()) {
        for (j in 1..rows.toInt() - i) {
            print(" ")
        }
        for (j in 1..i) {
            print("* ")
        }
        println()
        println()
    }
}