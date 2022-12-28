package Data

class Matkul (paramPkn: String,paramCoverbook:String, paramMtk: Int){
    init{
        println("Matkul $paramPkn dibaca")
    }

    constructor(paramPkn: String,paramCoverbook: String) :this (paramPkn,paramCoverbook, 2022) {
        println("Secondary Constractor1")
    }

    constructor (paramPkn: String) :this (paramPkn,""){
        println("Secondary Constractor2")

    }

    var pkn : String = paramPkn
    var coverbook:String =paramCoverbook
    var mtk: Int = paramMtk

}