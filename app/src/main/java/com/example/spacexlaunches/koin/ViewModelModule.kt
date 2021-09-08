package com.example.spacexlaunches.koin

import com.example.spacexlaunches.ui.activities.main.MainVM
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { MainVM(get()) }
}