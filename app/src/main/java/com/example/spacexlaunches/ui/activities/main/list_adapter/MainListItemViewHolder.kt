package com.example.spacexlaunches.ui.activities.main.list_adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.spacexlaunches.R
import com.example.spacexlaunches.domains.Falcon9LaunchItem

class MainListItemViewHolder(inflater: LayoutInflater, parent: ViewGroup)
    : RecyclerView.ViewHolder(inflater.inflate(R.layout.item_launch, parent)) {

    fun bind(item: Falcon9LaunchItem) {
        itemView.findViewById<ImageView>(R.id.item_image).let { image ->
            Glide.with(image.context).load(item.imageUrl).into(image)
        }

        itemView.findViewById<TextView>(R.id.item_title).text = item.title
        itemView.findViewById<TextView>(R.id.item_launch_date).text = item.launchDate

        AppCompatResources.getDrawable(
            itemView.context,
            if (item.isSuccess) R.drawable.ic_check_24 else R.drawable.ic_x_24
        )?.let {
            itemView.findViewById<ImageView>(R.id.item_mission_success_img).setImageDrawable(it)
        }
    }

}