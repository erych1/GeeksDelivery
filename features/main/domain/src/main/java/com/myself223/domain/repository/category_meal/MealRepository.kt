package com.myself223.domain.repository.category_meal

import com.myself223.common.Either
import com.myself223.domain.model.MealModel
import kotlinx.coroutines.flow.Flow

interface MealRepository {
    fun getMealByCategory(categoryName: String): Flow<Either<String, List<MealModel>>>
}