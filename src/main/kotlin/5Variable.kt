const val FAMILY_NAME: String = "hutabarat"
// todo const = Global variable || all can use
// todo const common usual is using UPPERCASE and _

fun main() {
    val firstName = "sabda"
    var lastName: String = "hutabarat"

    // todo val = immutable variable
    // todo var  = mutable variable

    lastName = "perdana"

    println("$firstName $lastName $FAMILY_NAME") //todo sabda perdana

    names()
}

private fun names() {
//    println(firstName) // todo > will error
    println(FAMILY_NAME) //todo > hutabarat
}