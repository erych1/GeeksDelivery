package com.myself223.main.presentation.module

import com.myself223.main.presentation.ui.fragments.menu.MenuViewModel
import org.koin.dsl.module


val uiModule = module {
    single { MenuViewModel(get(),get(),get()) }
}