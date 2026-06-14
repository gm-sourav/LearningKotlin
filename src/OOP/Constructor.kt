package OOP

class Student1(val name: String, val roll: Int){
    fun introduce(){
        println("$name is $roll")
    }
}

fun main() {
    val student1 = Student1("John", 35)
    student1.introduce()
}