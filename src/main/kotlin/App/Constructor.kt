package App

import Data.Matkul

fun main() {
    val uud = Matkul ("uud")
    uud.mtk = 1945
    val aljabar = Matkul ( "aljabara", "matematika dasar")

    println( uud.pkn)
    println( uud.mtk)
    println(aljabar.pkn)
    println( aljabar.mtk)
}