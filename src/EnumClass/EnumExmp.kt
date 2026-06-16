package EnumClass

enum class TrafficLight(val action: String) {
    RED("Stop"),
    YELLOW("Get Ready"),
    GREEN("Get Started");


    fun getInstruction(): String {
        return "Traffic Light Says : $action"
    }
}

    fun processTrafficLight(light: TrafficLight){
        when(light){
            TrafficLight.RED -> println(light.getInstruction())
            TrafficLight.YELLOW -> println(light.getInstruction())
            TrafficLight.GREEN ->  println(light.getInstruction())
        }
    }


fun main() {
    val red = TrafficLight.RED
    val yellow = TrafficLight.YELLOW
    val green = TrafficLight.GREEN


    processTrafficLight(TrafficLight.RED)
    processTrafficLight(TrafficLight.YELLOW)
    processTrafficLight(TrafficLight.GREEN)




}