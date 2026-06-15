package OOP.Inheritance

open class GrandParentsHouse{
    var rooms = 1
    var materials = "Mud"

    open fun describe() {
        println("This is $materials house where rooms = $rooms")
    }
}

open class ParentsHouse : GrandParentsHouse(){
    init {
       rooms = 3
       materials = "Concrete"

    }
    override fun describe() {
        println("This is $materials house where room =  $rooms")
    }
}


class ChildsHouse(val types: String) : ParentsHouse() {
    var type = types
    init {
        rooms = 5
    }
    override fun describe() {
        super.describe()
        println("This is $type house where rooms = $rooms")

    }
}

fun main() {
//    val grandParentsHouse = GrandParentsHouse()
//    grandParentsHouse.describe()
//
//    val parentsHouse = ParentsHouse()
//    parentsHouse.describe()

    val childsHouse = ChildsHouse("Modern")
    childsHouse.describe()
}