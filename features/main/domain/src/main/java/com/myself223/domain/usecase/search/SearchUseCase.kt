package com.myself223.domain.usecase.search

import com.myself223.common.Either
import com.myself223.domain.model.SearchMealModel
import com.myself223.domain.repository.meal_search.SearchMealRepository
import kotlinx.coroutines.flow.Flow

class SearchUseCase(private val repository: SearchMealRepository) {
    operator fun invoke(mealName: String) = repository.searchMeal(mealName = mealName)

    fun searchMeal(mealName: String): Flow<Either<String, List<SearchMealModel>>> = repository.searchMeal(mealName)

}