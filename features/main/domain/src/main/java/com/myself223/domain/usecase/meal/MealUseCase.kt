package com.myself223.domain.usecase.meal

import com.myself223.common.Either
import com.myself223.domain.model.MealModel
import com.myself223.domain.repository.category_meal.MealRepository
import com.myself223.domain.repository.category_repo.CategoryRepository
import kotlinx.coroutines.flow.Flow

class MealUseCase(private val repository: MealRepository) {
    operator fun invoke(categoryName: String) = repository.getMealByCategory(categoryName = categoryName)

    fun getMealsByCategory(categoryName: String): Flow<Either<String, List<MealModel>>> = repository.getMealByCategory(categoryName)

}