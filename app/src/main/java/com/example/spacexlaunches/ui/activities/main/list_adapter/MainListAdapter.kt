package com.example.spacexlaunches.ui.activities.main.list_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.spacexlaunches.domains.Falcon9LaunchItem

class MainListAdapter(private val items: List<Falcon9LaunchItem>)
    : RecyclerView.Adapter<MainListItemViewHolder>() {

    private lateinit var layoutInflater: LayoutInflater

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainListItemViewHolder {
        if (!::layoutInflater.isInitialized)
            layoutInflater = LayoutInflater.from(parent.context)

        return MainListItemViewHolder(layoutInflater, parent)
    }

    override fun onBindViewHolder(holder: MainListItemViewHolder, position: Int) =
        holder.bind(items[position])

    override fun getItemCount(): Int = items.size

}