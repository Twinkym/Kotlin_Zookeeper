fun main() {
    val number1 = 10
    val number2 = 0
    val sample = readln().toInt()
    val inRange = sample in (number2 + 1) until number1
    print(inRange)
}