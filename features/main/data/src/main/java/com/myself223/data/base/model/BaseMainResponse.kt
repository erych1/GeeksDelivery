package com.myself223.data.base.model

import com.myself223.data.remote.dto.CategoryDto
import com.myself223.data.remote.dto.MealDto
import com.myself223.data.remote.dto.SearchMealDto

class BaseMainResponse(
    val categories: List<CategoryDto>,
    val meals:List<MealDto>,
    val searchMeal:List<SearchMealDto>
)
