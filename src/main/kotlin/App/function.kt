package App

import Data.Student

fun main() {
    val Adi = Student()
    Adi.name = "Adi"
    Adi.npm  = 53417914
    Adi.lastName= "nugroho"

    Adi.sayHello("Adi")
    val fullname = Adi.getFullName()
    println(fullname)

}