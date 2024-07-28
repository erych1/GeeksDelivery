package com.myself223.data.remote.dto

import com.google.gson.annotations.SerializedName
import com.myself223.data.mapper.DataMapper
import com.myself223.domain.model.CategoryModel

data class CategoryDto(
    @SerializedName("idCategory")
    val id:String? = null,
    @SerializedName("strCategory")
    val name:String? = null,
    @SerializedName("strCategoryThumb")
    val img:String?= null,
    @SerializedName("strCategoryDescription")
    val categoryDesc: String? = null,
): DataMapper<CategoryModel> {
    override fun toDomain()= CategoryModel(
        id = id,
        categoryDesc = categoryDesc,
        name = name,
        imgD = img
    )
}
