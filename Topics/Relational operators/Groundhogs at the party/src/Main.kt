const val MIN1 = 10
const val MAX1 = 20
const val MIN = 15
const val MAX = 25
fun main() {
    val cups = readln().toInt()
    val weekend = readln().toBoolean()
    if (weekend) {
        print(cups in MIN..MAX)
    } else {
        print(cups in MIN1..MAX1)
    }
}