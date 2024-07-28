package com.myself223.main.presentation.ui.fragments.basket

import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.core.base.BaseFragment
import com.myself223.main.R
import com.myself223.main.databinding.FragmentBasketBinding

class BasketFragment : BaseFragment<FragmentBasketBinding, BasketViewModel>(R.layout.fragment_basket) {

    override val binding: FragmentBasketBinding by viewBinding(FragmentBasketBinding::bind)
    override val viewModel = BasketViewModel()

}
