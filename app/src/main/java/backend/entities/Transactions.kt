package backend.entities

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey



@Entity(
    foreignKeys = [
        ForeignKey(
            entity = Categories::class,
            parentColumns = ["name"],
            childColumns = ["category"],
            onDelete = ForeignKey.CASCADE
        ) // Foreign Key for Category
    ]
)
data class Transactions(
    @PrimaryKey val id: String,
    val income: Boolean, //TODO: change to enum, with options being income, expense and transfer.
    val amount: Float,
    val name: String,
    val category: String,
    val timestamp: String,
    val description: String
)
