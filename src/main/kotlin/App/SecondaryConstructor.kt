package App

import Data.Address

fun main() {
    val address1 = Address ("Jalan Kebon nanas","Jakarta Timur")
    val address2 = Address("Jalan cimahi", "Bogor","Indonesia")

    println(address1.street )
    println(address1.city)
    println(address2.street)
    println(address2.city)
    println(address2.country)

}