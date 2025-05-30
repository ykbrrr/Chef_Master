package ie.setu.chefmaster

data class Dish(
    val id: Int,
    val name: String,
    val imageResId: Int,
    val ingredients: List<String>,
    val steps: List<String>,
    val cookingTime: String,
    val difficulty: String
)
