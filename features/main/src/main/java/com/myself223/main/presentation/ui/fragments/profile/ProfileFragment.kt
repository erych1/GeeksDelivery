package com.myself223.main.presentation.ui.fragments.profile

import by.kirich1409.viewbindingdelegate.viewBinding
import com.myself223.core.base.BaseFragment
import com.myself223.main.R
import com.myself223.main.databinding.FragmentProfileBinding


class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>(R.layout.fragment_profile) {
    override val binding: FragmentProfileBinding by viewBinding (FragmentProfileBinding::bind)
    override val viewModel =  ProfileViewModel()

}
