fun main() {
    val invitation = readLine().toBoolean() // read other value in the same way
    val gift = readLine().toBoolean()
    if (invitation && gift) {
        print(true)
    } else {
        print(false)
    }
}