package hr.ferit.lucijasteler.lv5

import androidx.annotation.DrawableRes

data class Recipe(
    @DrawableRes var image: Int,
    var title: String,
    var category: String,
    var cookingTime: String,
    var energy: String,
    var rating: String,
    var description: String,
    var reviews: String,
    var ingredients: List<Ingredient>
)