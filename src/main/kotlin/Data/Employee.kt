package Data

open class Employee (val name: String) {

    open fun sayHello(name: String){
        println("Hello $name, My name is ${this.name}")
    }
}

    open class  Ketua (name: String): Employee (name) {
       final override fun sayHello(name: String) {
            super.sayHello(name)
            println("Hello $name, My name is Ketua ${this.name}")
        }
    }

    class  WakilKetua (name: String): Employee (name){
        override fun sayHello(name: String) {
            super.sayHello(name)
            println("Hello $name, My name is Wakil Ketua ${this.name}")
        }
    }

    class KetuaYayasan(name:String) :Ketua(name) {
       // Error apabila Ketua ditamabhakan Final oveeride fun
  //      override fun sayHello(name: String) {
    //        super.sayHello(name)
      //      println("Hello $name, My name is KetuaY ayasan ${this.name}")
        }

