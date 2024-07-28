package com.myself223.data.remote.repository.search

import com.myself223.common.Either
import com.myself223.data.base.repository.makeNetworkRequest
import com.myself223.data.remote.apiservice.ApiService
import com.myself223.domain.model.SearchMealModel
import com.myself223.domain.repository.meal_search.SearchMealRepository
import kotlinx.coroutines.flow.Flow

class SearchMealRepositoryImpl(private val api:ApiService) :SearchMealRepository{
    override fun searchMeal(mealName:String): Flow<Either<String, List<SearchMealModel>>> =
        makeNetworkRequest {
                api.getMealBySearch(mealName).searchMeal.map { it.toDomain() }
        }
}