fun main() {
    //todo function
    makan()

    //todo function with params
    callMe("sabda")

    callMeLoop("karen", 5)
}

private fun makan() {
    println("Breakfast with")
}

private fun callMe(name: String) {
    println("Breakfast with $name")
}

private fun callMeLoop(name: String, index: Int) {
    var i = 0
    while (i < index) {
        println("Breakfast with $name day ${i + 1}")
        i++
    }
}