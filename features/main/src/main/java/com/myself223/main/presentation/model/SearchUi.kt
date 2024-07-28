package com.myself223.main.presentation.model

import com.myself223.domain.model.SearchMealModel

data class SearchUi(
    val id:String? = null,
    val name:String?=null,
    val category:String? = null ,
    val country:String? = null,
    val image:String? = null,
    val ingredient1:String? = null,
    val ingredient2:String? = null,
    val ingredient3:String? = null,
    val ingredient4:String? = null,
    val ingredient5:String? = null,
    val ingredient6:String? = null,
    val ingredient7:String? = null,
    val ingredient8:String? = null,
    val ingredient9:String? = null,
    val ingredient10:String? = null,
    val ingredient11:String? = null,
    val ingredient12:String? = null,
    val ingredient13:String? = null
){
    fun getAllIngredients(): String {
        return listOfNotNull(
            ingredient1, ingredient2, ingredient3, ingredient4, ingredient5,
            ingredient6, ingredient7, ingredient8, ingredient9, ingredient10,
            ingredient11, ingredient12, ingredient13
        ).joinToString(", ")
    }
}
fun SearchMealModel.tiUI() = SearchUi(
    id = id,
    name = name,
    category = category,
    country=country,
    image=image,
    ingredient1 = ingredient1,
    ingredient2 = ingredient2,
    ingredient3 = ingredient3,
    ingredient4 = ingredient4,
    ingredient5 = ingredient5,
    ingredient6 = ingredient6,
    ingredient7 = ingredient7,
    ingredient8 = ingredient8,
    ingredient9 = ingredient9,
    ingredient10 = ingredient10,
    ingredient11 = ingredient11,
    ingredient13 = ingredient12,
    ingredient12 = ingredient13,
)
