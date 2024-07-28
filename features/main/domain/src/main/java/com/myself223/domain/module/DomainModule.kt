package com.myself223.domain.module

import com.myself223.domain.usecase.category.CategoryUseCase
import com.myself223.domain.usecase.meal.MealUseCase
import com.myself223.domain.usecase.search.SearchUseCase
import org.koin.dsl.module


val useCaseModule = module {
    single { CategoryUseCase(get()) }
    single { MealUseCase(get()) }
    single { SearchUseCase(get()) }
}