const val Z = 20
fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    print(
        (a + b == Z).toString().toBoolean() ||
            (a + c == Z).toString().toBoolean() ||
            (b + c == Z).toString().toBoolean()
    )
}