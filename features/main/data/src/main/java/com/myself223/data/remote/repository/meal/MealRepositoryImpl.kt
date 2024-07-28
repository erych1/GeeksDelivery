package com.myself223.data.remote.repository.meal

import com.myself223.common.Either
import com.myself223.data.base.repository.makeNetworkRequest
import com.myself223.data.remote.apiservice.ApiService
import com.myself223.domain.model.MealModel
import com.myself223.domain.repository.category_meal.MealRepository
import kotlinx.coroutines.flow.Flow

class MealRepositoryImpl(private val api: ApiService) : MealRepository {
    override fun getMealByCategory(categoryName: String): Flow<Either<String, List<MealModel>>> =
        makeNetworkRequest {
            api.getMealsByCategory(categoryName).meals.map { it.toDomain() }
    }
}
