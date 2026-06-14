package OOP


              // Primary Constructor

//class Student1(val name: String, val roll: Int){
//    fun introduce(){
//        println("$name is $roll")
//    }
//}
//
//fun main() {
//    val student1 = Student1("John", 35)
//    student1.introduce()
//}


class Car1 {
    var model:String
    var color:String


    constructor(model:String){
        this.model = model
        this.color = "No Color"
        println("Model Cons")
 }
    constructor(model:String, color:String){
        this.model = model
        this.color = color
        println("Model & color Cons")
    }

    fun horn(){
        println("$color $model horn : beep beep")
    }

}


fun main() {
    val car1 = Car1("Hunda")
    val car2 = Car1("Honda", "blue")
    car1.horn()
    car2.horn()
}
