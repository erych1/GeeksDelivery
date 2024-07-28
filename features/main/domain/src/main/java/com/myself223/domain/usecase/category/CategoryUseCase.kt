package com.myself223.domain.usecase.category

import com.myself223.common.Either
import com.myself223.domain.model.MealModel
import com.myself223.domain.repository.category_repo.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryUseCase(private val repository: CategoryRepository) {
    operator fun invoke() = repository.getAllCategory()

}