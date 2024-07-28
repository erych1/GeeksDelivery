package com.myself223.data.remote.repository.category

import com.myself223.common.Either
import com.myself223.data.base.repository.makeNetworkRequest
import com.myself223.data.remote.apiservice.ApiService
import com.myself223.domain.model.CategoryModel
import com.myself223.domain.repository.category_repo.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryRepositoryImpl(private val api: ApiService) : CategoryRepository {
    override fun getAllCategory(): Flow<Either<String, List<CategoryModel>>> =
        makeNetworkRequest {
            api.getAllCategory().categories.map { it.toDomain() }
    }
}
