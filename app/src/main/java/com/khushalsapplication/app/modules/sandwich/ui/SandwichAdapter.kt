package com.khushalsapplication.app.modules.sandwich.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSandwichBinding
import com.khushalsapplication.app.modules.sandwich.`data`.model.SandwichRowModel
import kotlin.Int
import kotlin.collections.List

class SandwichAdapter(
  var list: List<SandwichRowModel>
) : RecyclerView.Adapter<SandwichAdapter.RowSandwichVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSandwichVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sandwich,parent,false)
    return RowSandwichVH(view)
  }

  override fun onBindViewHolder(holder: RowSandwichVH, position: Int) {
    val sandwichRowModel = SandwichRowModel()
    // TODO uncomment following line after integration with data source
    // val sandwichRowModel = list[position]
    holder.binding.sandwichRowModel = sandwichRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SandwichRowModel>) {
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
      item: SandwichRowModel
    ) {
    }
  }

  inner class RowSandwichVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSandwichBinding = RowSandwichBinding.bind(itemView)
  }
}
