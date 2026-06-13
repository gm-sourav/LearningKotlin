package OOP

class Student{
     var name = ""
     var roll = 0

    fun doHomework(){
        println("Am doing my home works")
    }

    fun display() {
        println(name)
        println(roll)
    }

}

fun main() {
    var student1 = Student()
    var student2 = Student()

    student1.name = "Sourov"
    student1.roll = 10
    student1.doHomework()
    student1.display()

    student2.name = "Prithibi"
    student2.roll = 1
    student2.doHomework()
    student2.display()

}

