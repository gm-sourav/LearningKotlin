package OOP

class Car{
    var name = ""
    var model = ""
    var color = ""
    var engine = ""

    fun horn() {
        println("$model bolce --- Beep")
    }

    fun carColor() {
        println("$color cars color")
    }


}

fun main() {
    var car1 = Car()
    var car2 = Car()

    car1.name = "Maruti"
    car1.model = "xyz"
    car1.color = "blue"
    car1.engine = "n"

    car1.horn()
    car1.carColor()
}