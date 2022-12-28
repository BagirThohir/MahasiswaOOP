package App

import Data.Employee
import Data.Ketua
import Data.WakilKetua

fun main() {
    var employee: Employee = Employee("adi")
    employee.sayHello("adi")

    employee = Ketua ("Adi")
    employee.sayHello("Nugrogo")

    employee = WakilKetua ("Sinta")
    employee.sayHello("pariaman")
}