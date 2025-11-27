package hr.ferit.lucijasteler.lv5

import androidx.annotation.DrawableRes

data class Ingredient(
    @DrawableRes var image: Int,
    var title: String,
    var subtitle: String
)
