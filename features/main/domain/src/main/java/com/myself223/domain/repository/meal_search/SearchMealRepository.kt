package com.myself223.domain.repository.meal_search

import com.myself223.common.Either
import com.myself223.domain.model.SearchMealModel
import kotlinx.coroutines.flow.Flow

interface SearchMealRepository {
    fun searchMeal(mealName:String): Flow<Either<String, List<SearchMealModel>>>
}