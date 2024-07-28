package com.myself223.main.presentation.ui.fragments.menu

import android.widget.Toast
import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.core.base.BaseFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import com.myself223.main.presentation.ui.adapters.menu_adapters.CategoryAdapter
import com.myself223.main.presentation.ui.adapters.menu_adapters.MealAdapter
import com.myself223.main.R
import com.myself223.main.databinding.FragmentMenuBinding
import com.myself223.main.presentation.ui.adapters.menu_adapters.SearchAdapter

class MenuFragment : BaseFragment<FragmentMenuBinding, MenuViewModel>(R.layout.fragment_menu) {
    override val binding: FragmentMenuBinding by viewBinding(FragmentMenuBinding::bind)
    override val viewModel: MenuViewModel by viewModel()
    private val categoryAdapter: CategoryAdapter by lazy { CategoryAdapter(this::click) }
    private val mealAdapter: MealAdapter by lazy { MealAdapter() }
    private val searchAdapter:SearchAdapter by lazy { SearchAdapter() }

    override fun init() {
        binding.rvCategory.adapter = categoryAdapter
        binding.rvMeals.adapter = mealAdapter
        binding.banners.adapter = searchAdapter

    }

    private fun click(nameCategory: String) {
        viewModel.getMealsByCategory(nameCategory)
    }

    override fun launchObserver() {
        viewModel.getAllCategory()
        viewModel.categoriesState.observeUIState(success = { categories ->
            categoryAdapter.submitList(categories)
        }, error = { ex ->
            Toast.makeText(requireContext(), ex, Toast.LENGTH_SHORT).show()
        })

        viewModel.mealsState.observeUIState(success = { meals ->
            mealAdapter.submitList(meals)
        }, error = { ex ->
            Toast.makeText(requireContext(), ex, Toast.LENGTH_SHORT).show()
        })
    }
}

