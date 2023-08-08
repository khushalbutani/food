package com.khushalsapplication.app.modules.clubsandwich.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowClubSandwichBinding
import com.khushalsapplication.app.modules.clubsandwich.`data`.model.ClubSandwichRowModel
import kotlin.Int
import kotlin.collections.List

class ClubSandwichAdapter(
  var list: List<ClubSandwichRowModel>
) : RecyclerView.Adapter<ClubSandwichAdapter.RowClubSandwichVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowClubSandwichVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_club_sandwich,parent,false)
    return RowClubSandwichVH(view)
  }

  override fun onBindViewHolder(holder: RowClubSandwichVH, position: Int) {
    val clubSandwichRowModel = ClubSandwichRowModel()
    // TODO uncomment following line after integration with data source
    // val clubSandwichRowModel = list[position]
    holder.binding.clubSandwichRowModel = clubSandwichRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ClubSandwichRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ClubSandwichRowModel
    ) {
    }
  }

  inner class RowClubSandwichVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowClubSandwichBinding = RowClubSandwichBinding.bind(itemView)
  }
}
