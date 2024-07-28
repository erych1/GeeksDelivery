package com.myself223.data.module

import  com.myself223.data.remote.repository.category.CategoryRepositoryImpl
import com.myself223.data.remote.repository.meal.MealRepositoryImpl
import com.myself223.data.remote.repository.search.SearchMealRepositoryImpl
import com.myself223.domain.repository.category_meal.MealRepository
import com.myself223.domain.repository.category_repo.CategoryRepository
import com.myself223.domain.repository.meal_search.SearchMealRepository
import org.koin.dsl.module

val repoModule = module {
    single<CategoryRepository>{ CategoryRepositoryImpl(get()) }
    single<MealRepository>{ MealRepositoryImpl(get()) }
    single<SearchMealRepository>{ SearchMealRepositoryImpl(get()) }
}