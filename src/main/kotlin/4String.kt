fun main() {
    //todo string is using "" not ''
    val firstName: String = "sabda"
    val lastName: String = "hutabarat"

    println("my name is $firstName $lastName")

    // todo if more than 1 line use """ and .trimIndent()
    val address: String = """
        Kuta Galuh
        Tigabinanaga
        Kab Karo
        Sumatera Utara
    """.trimIndent()

    println("i  am from $address")
    // todo i  am from Kuta Galuh
    // todo Tigabinanaga
    // todo Kab Karo
    // todo Sumatera Utara

    val nameList: String = """
    >sabda
    >cindi
    >rangga
    >abdi
    """.trimMargin(">")
    //todo same as trimIndent but use special characther

    println(nameList)

    println("halo my name is $firstName and my name is ${firstName.length} character")
    //todo halo my name is sabda and my name is 5 character
}