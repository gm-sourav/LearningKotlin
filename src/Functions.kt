fun calculateMarks (maths: Int, physics: Int, chemestry: Int) {
    val total = maths + physics + chemestry
    println("Total marks = $total")

}

fun order(item: String, quantity: Int) {
    println("Your order is $item $quantity")
}


fun calculatePer(marks: Int, totalMarks:Int) : Float {
    return (marks.toFloat() / totalMarks) * 100
}

fun main() {
    //calculateMarks(90, 70, 78)
   //order("Coffe", 5)
    val result = calculatePer(90,100)
    println("Result: $result%")
}