package com.myself223.main.presentation.model

import com.myself223.domain.model.MealModel

data class MealUi(
    val nameMeal: String? = null,
    val imgMeal:String? = null
)

fun MealModel.toUI() = MealUi(
    nameMeal = nameMeal,
    imgMeal = imgMeal
)
