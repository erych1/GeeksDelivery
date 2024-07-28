package com.myself223.domain.repository.category_repo

import com.myself223.common.Either
import com.myself223.domain.model.CategoryModel
import com.myself223.domain.model.MealModel
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getAllCategory(): Flow<Either<String, List<CategoryModel>>>
    }