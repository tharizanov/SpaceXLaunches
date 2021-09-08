package com.example.spacexlaunches.ui.activities.main

import androidx.databinding.ObservableArrayList
import androidx.lifecycle.*
import com.example.spacexlaunches.api.ApiRequestManager
import com.example.spacexlaunches.domains.Falcon9LaunchItem
import com.example.spacexlaunches.util.ObservableListChangedCallbackImpl
import kotlinx.coroutines.launch

class MainVM(
    private val apiRequestManager: ApiRequestManager
) : ViewModel(), LifecycleObserver {

    val isLoading = MutableLiveData(true)

    val itemsList = ObservableArrayList<Falcon9LaunchItem>().apply {
        addOnListChangedCallback(object : ObservableListChangedCallbackImpl<Falcon9LaunchItem>() {
            override fun onChanged(sender: ObservableArrayList<Falcon9LaunchItem>?) {
                if (sender.isNullOrEmpty().not()) {
                    isLoading.value = false
                }
            }
        })
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate() {
        viewModelScope.launch {
            apiRequestManager.sendGetRequest()
        }
    }

}