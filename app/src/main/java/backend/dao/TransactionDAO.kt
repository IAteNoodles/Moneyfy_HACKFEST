// TransactionDao.kt
package backend.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import backend.entities.Transactions

@Dao
interface TransactionDao {

    @Insert
    suspend fun insertTransaction(transaction: Transactions)

    @Update
    suspend fun updateTransaction(transaction: Transactions)

    @Query("SELECT * FROM Transactions WHERE id = :transactionId")
    suspend fun getTransactionById(transactionId: String): Transactions

    @Query("DELETE FROM Transactions WHERE id = :transactionId")
    suspend fun deleteTransactionById(transactionId: String)

    @Query("SELECT * FROM Transactions")
    suspend fun getAllTransactions(): List<Transactions>

    // Add more methods as needed
}
