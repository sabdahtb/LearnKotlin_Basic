fun main() {
//    todo Type data number in kotlin
    val age: Int = 200
    val sample: Float = 10.9F
    val doubleSample: Double = 10.99

    println(age)
    println(sample)
    println(doubleSample)

    val binary: Int = 0b01010101
    println(binary) // todo 85 = byte to decimal

    val price: Long = 9_000_000_000L //todo use underscore for very big number
    println(price) //todo 9000000000

    // todo conversion for all number type
    // todo toSort()
    // todo toLong()
    // todo toDouble()
    // todo toFloat()
    // todo toInt()

    // todo example

    val binaryDouble: Double = binary.toDouble()
    println(binaryDouble) //todo 85.0
}