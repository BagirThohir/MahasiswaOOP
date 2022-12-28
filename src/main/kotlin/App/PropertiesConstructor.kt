package App

import Data.User

fun main() {
    val  user1 = User("Adi" , "rahasia")
    val  user2 = User("Dandy", "Rahasia123")

    user1.username = "Edi"
    user2.password = "Rahasia Bingit"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}