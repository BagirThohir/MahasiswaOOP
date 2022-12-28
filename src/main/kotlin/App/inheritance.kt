package App

import Data.Ketua
import Data.WakilKetua

fun main() {
    val ketua = Ketua ("Adi")
    ketua.sayHello("adi")

    val wakilKetua= WakilKetua ("jono")
    wakilKetua.sayHello("jono kasino")
}