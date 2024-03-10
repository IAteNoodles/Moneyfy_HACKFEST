package backend

import backend.entities.Transactions

fun main() {
    val transaction = Transactions(
        id = "123",
        income = true,
        description = "test",
        name = "test",
        amount = 100.0f,
        category = "Food",
        timestamp = "2022-02-02"
    )
    println("Transaction ID: ${transaction.id}")
    println("Amount: ${transaction.amount}")
    println("Category: ${transaction.category}")
    // Print other properties as needed
}
