package Data

import javax.naming.Name

class Student {
    var name:String = ""
    var npm:Int= 3412311
    var lastName:String=""

    fun sayHello(name:String):Unit{
        println("Hello $name, MyName is $name")
    }

    fun sayHello(name:String, lastName:String){
        println("Hello $name $npm, my name and my npm is ${this.lastName}")
    }


    fun college(){
        println("im college in the university Gunadarma")
    }

    fun getFullName() : String {
        return "$name $npm $lastName"
    }


}