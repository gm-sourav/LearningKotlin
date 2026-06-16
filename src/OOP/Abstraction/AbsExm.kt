package OOP.Abstraction

abstract class Vehicle {
    abstract fun engine()

    fun horn() {
        println("Beep")
    }
}

class Car : Vehicle(){
    override fun engine() {
        println("Car engine model = 10c")
    }
}

class Bike: Vehicle(){
    override fun engine() {
        println("Bike engine model = 20c")
    }
}

fun main() {

    var car1 = Car()
    var bike1 = Bike()

    car1.engine()
    bike1.engine()
}