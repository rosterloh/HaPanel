package com.rosterloh.things.hapanel.di

import com.rosterloh.things.hapanel.ui.PanelViewModel
import org.koin.androidx.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

val appModule = module {

    viewModel { PanelViewModel() }

}