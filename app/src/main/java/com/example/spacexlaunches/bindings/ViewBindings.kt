package com.example.spacexlaunches.bindings

import android.view.View
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.spacexlaunches.domains.Falcon9LaunchItem
import com.example.spacexlaunches.ui.activities.main.list_adapter.ListItemDecoration
import com.example.spacexlaunches.ui.activities.main.list_adapter.MainListAdapter

@BindingAdapter("visibility")
fun setVisibility(view: View, isVisible: Boolean) {
    view.visibility = if (isVisible) View.VISIBLE else View.GONE
}

@BindingAdapter("items")
fun setItems(view: RecyclerView, items: List<Falcon9LaunchItem>) {
    view.layoutManager = LinearLayoutManager(view.context)
    view.adapter = MainListAdapter(items)
    view.addItemDecoration(ListItemDecoration())
}