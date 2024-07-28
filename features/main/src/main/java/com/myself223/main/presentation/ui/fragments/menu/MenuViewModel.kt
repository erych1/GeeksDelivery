package com.myself223.main.presentation.ui.fragments.menu
import android.util.Log
import com.myself223.core.base.BaseViewModel
import com.myself223.domain.usecase.category.CategoryUseCase
import com.myself223.domain.usecase.meal.MealUseCase
import com.myself223.domain.usecase.search.SearchUseCase
import com.myself223.main.presentation.model.CategoryUi
import com.myself223.main.presentation.model.MealUi
import com.myself223.main.presentation.model.SearchUi
import com.myself223.main.presentation.model.tiUI
import com.myself223.main.presentation.model.toUI
import kotlinx.coroutines.flow.asStateFlow



class MenuViewModel(
    private val categoryUseCase: CategoryUseCase,
    private val mealUseCase: MealUseCase,
    private val searchUseCase: SearchUseCase
) : BaseViewModel() {
    private val _categoriesState = mutableStateFlow<List<CategoryUi>>()
    val categoriesState = _categoriesState.asStateFlow()
    private val _mealsState = mutableStateFlow<List<MealUi>>()
    val mealsState = _mealsState.asStateFlow()
    private val _searchMealsState = mutableStateFlow<List<SearchUi>>()
    val searchMealsState = _searchMealsState.asStateFlow()
    fun getAllCategory()=
        categoryUseCase().gatherRequest(_categoriesState){ categoryModel ->
            categoryModel.map { it.toUI() }

        }

    fun getMealsByCategory(categoryName: String) =
        mealUseCase.getMealsByCategory(categoryName = categoryName).gatherRequest(_mealsState) { mealModel ->
            mealModel.map { it.toUI() }
        }
    fun searchMeal(mealName:String)=
        searchUseCase.searchMeal(mealName=mealName).gatherRequest(_searchMealsState){srch->
            srch.map { it.tiUI() }
        }



    init {
        Log.d("MenuViewModel", "ViewModel initialized")
    }

}
