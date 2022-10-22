fun main() {
    // todo for in loops

    val arrayAlphabet = arrayOf("A", "B", "C", "D", "E", "F","G")

    for (alphabet in arrayAlphabet){
        println(alphabet)
    }

    for (i in 0..arrayAlphabet.size - 1){
        println("index $i = ${arrayAlphabet.get(i)}")
    }

    // todo while loops

    var i = 0
    while (i < 5){
        println(i)
        i++
    }

    // todo do while loops
    var a = 0
    do {
        println("do while $a")
        a++
    }while (a < 5)

    // todo break
    var b = 0
    while (true){
        println("break in index 5")
        b++
        if(b > 5){
            break // todo break >< continue
        }
    }
}