package OOP.Encapsulation

class BankAccount{
    private var balance: Double = 0.0
    private var accountHolder: String = ""

    fun setAccountHolder(name: String){
        if (name.isNotEmpty()) {
            accountHolder = name
        } else {
            println("Name is empty")
        }

    }

    fun getAccountHolder() : String {
        return accountHolder
    }


    fun setBalance(amount : Double) {
        if (amount > 0) {
            balance += amount
        } else {
            println("Amount is empty")
        }
    }

    fun getbalance() : Double {
        return balance
    }

}

fun main() {
    var account: BankAccount = BankAccount()
    account.setAccountHolder("Sourov")
    println("Account Holder : ${account.getAccountHolder()}")

    account.setBalance(1000.50)
    println("Balance = ${account.getbalance()} BDT")
}