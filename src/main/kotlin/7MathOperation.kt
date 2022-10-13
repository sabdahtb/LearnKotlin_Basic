fun main() {
    // todo math operator in kt [ + , - , * , / , % ]
    var result: Int = 10 + 2 / 2
    println(result) // todo 11

    // todo Argument assignment in kt [ += , -= , *= , /= , %= ]
    result += 10
    println(result) // todo 21

    result--
    println(result) // todo 20

    // todo math operator in kt [ > , < , >= , <= , == , != ]
    val isResult20: Boolean = result == 20
    println("result = 20 == $isResult20")
}