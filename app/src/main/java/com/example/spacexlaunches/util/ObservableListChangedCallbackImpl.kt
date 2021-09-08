package com.example.spacexlaunches.util

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableList
import com.example.spacexlaunches.domains.Falcon9LaunchItem

abstract class ObservableListChangedCallbackImpl<T> :
    ObservableList.OnListChangedCallback<ObservableArrayList<T>>() {

    override fun onChanged(sender: ObservableArrayList<T>?) {}

    override fun onItemRangeChanged(
        sender: ObservableArrayList<T>?,
        positionStart: Int,
        itemCount: Int
    ) {}

    override fun onItemRangeInserted(
        sender: ObservableArrayList<T>?,
        positionStart: Int,
        itemCount: Int
    ) {}

    override fun onItemRangeMoved(
        sender: ObservableArrayList<T>?,
        fromPosition: Int,
        toPosition: Int,
        itemCount: Int
    ) {}

    override fun onItemRangeRemoved(
        sender: ObservableArrayList<T>?,
        positionStart: Int,
        itemCount: Int
    ) {}
}