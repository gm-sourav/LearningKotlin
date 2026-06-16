package OOP.Polymorphism

open class Animal{
    open fun makeSound() {
        println("No sound")
    }
}


class Dog : Animal() {
    override fun makeSound() {
        println("Barking")
    }
}

class Cat : Animal() {
    override fun makeSound() {
        println("Mew Mew")
    }
}

fun main() {
    val animal1 : Animal = Dog()
    val animal2 : Animal = Cat()

    animal1.makeSound()
    animal2.makeSound()
}