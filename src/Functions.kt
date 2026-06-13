fun calculateMarks (maths: Int, physics: Int, chemestry: Int) {
    val total = maths + physics + chemestry
    println("Total marks = $total")

}

fun order(item: String, quantity: Int) {
    println("Your order is $item $quantity")
}

fun main() {
    //calculateMarks(90, 70, 78)
    order("Coffe", 5)
}