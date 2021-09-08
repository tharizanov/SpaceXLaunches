package com.example.spacexlaunches.koin

import com.example.spacexlaunches.api.ApiRequestManager
import org.koin.dsl.module

val apiModule = module {
    single { ApiRequestManager() }
}