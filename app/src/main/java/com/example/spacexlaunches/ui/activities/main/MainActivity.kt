package com.example.spacexlaunches.ui.activities.main

import android.app.Activity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.spacexlaunches.R
import com.example.spacexlaunches.databinding.ActivityMainBinding
import org.koin.android.viewmodel.compat.ViewModelCompat.viewModel

class MainActivity : Activity() {

    private val vm: MainVM by viewModel()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

}