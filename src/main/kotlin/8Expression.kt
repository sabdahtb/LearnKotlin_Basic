fun main() {
    // todo expression in kotlin
    // if expression

    val is90 = 90

    if(is90 == 90){
        println("is90 = 90")
    } else if(is90 == 80){
        print("is90 =- 80")
    }
    else {
        print("is90 is not 90")
    }

    // when expression
    // more simple than if  -> like switch case

    val alphabet = "A"

    when(alphabet) {
        "A" -> {
            println("alphabet = A")
        }
        "B" -> {
            println("alphabet = B")
        }
        "C" -> {
            println("alphabet = C")
        }
    }

    // todo when in many condition
    // with else

    when(alphabet) {
        "A" , "B", "C" -> println("alphabet is A | B | C")
        else -> {
            print("not A,B,C")
        }
    }

    //todo when value is inside array
    val alphabetList = arrayOf("A","B","C")
    when(alphabet){
        in alphabetList -> println("alphabet = inside alphabetList")
        !in alphabetList -> println("alphabet != inside alphabetList")
    }

    //todo when to check data type
    when(alphabet){
        is String -> println("alphabet = string")
        !is String -> println("alphabet != Int")
    }

    val examResult = 75
    when {
        examResult > 90 -> println("A+ grade")
        examResult > 80 -> println("A grade")
        examResult > 70 -> println("B grade")
        examResult > 60 -> println("C grade")
        examResult > 50 -> println("D grade")
        else -> {
            println("Nice Try")
        }
    }
}