fun main() {
    val arrName: Array<String> = arrayOf("sabda", "cindi", "rangga", "abdi")

    for (name in arrName) {
        println(name)
    }

    println(arrName[0])
    //todo sabda

    //todo nullable array
    val names: Array<String?> = arrayOfNulls(4)
    names.set(0, "sabda")
    names.set(1, null)
//    names.set(4, null) // todo will error || size arrayOfNulls = 4 but index 4 indicate length = 5

    println("names in index 1 is ${names[1]}")
}