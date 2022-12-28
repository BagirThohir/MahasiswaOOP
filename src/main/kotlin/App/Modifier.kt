package App

import Data.Teacher

fun main() {
    val teacher=Teacher("Adi")
    println(teacher.name)
    //teacher.teach() // Error
    teacher.test()
}