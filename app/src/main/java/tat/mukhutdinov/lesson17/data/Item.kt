package tat.mukhutdinov.lesson17.data

/**
 * Entity data class represents a single row in the database.
 */
class Item(
    val id: Int = 0,
    val name: String,
    val price: Double,
    val quantity: Int
)
