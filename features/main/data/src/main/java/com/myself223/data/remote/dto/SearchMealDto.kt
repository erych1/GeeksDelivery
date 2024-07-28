package com.myself223.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.myself223.data.mapper.DataMapper
import com.myself223.domain.model.SearchMealModel

data class SearchMealDto(
    @SerializedName("idMeal")
    val id:String? = null,
    @SerializedName("strMeal")
    val name:String?=null,
    @SerializedName("strCategory")
    val category:String? = null ,
    @SerializedName("strArea")
    val country:String? = null,
    @SerializedName("strMealThumb")
    val image:String? = null,
    @SerializedName("strIngredient1")
    val ingredient1:String? = null,
    @SerializedName("strIngredient2")
    val ingredient2:String? = null,
    @SerializedName("strIngredient3")
    val ingredient3:String? = null,
    @SerializedName("strIngredient4")
    val ingredient4:String? = null,
    @SerializedName("strIngredient5")
    val ingredient5:String? = null,
    @SerializedName("strIngredient6")
    val ingredient6:String? = null,
    @SerializedName("strIngredient7")
    val ingredient7:String? = null,
    @SerializedName("strIngredient8")
    val ingredient8:String? = null,
    @SerializedName("strIngredient9")
    val ingredient9:String? = null,
    @SerializedName("strIngredient10")
    val ingredient10:String? = null,
    @SerializedName("strIngredient11")
    val ingredient11:String? = null,
    @SerializedName("strIngredient12")
    val ingredient12:String? = null,
    @SerializedName("strIngredient13")
    val ingredient13:String? = null
):DataMapper<SearchMealModel> {
    override fun toDomain()= SearchMealModel (
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
}
