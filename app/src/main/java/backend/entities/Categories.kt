package backend.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Categories(
    @PrimaryKey val name: String, // the name of the category
    val description: String, // the description of the category
)
