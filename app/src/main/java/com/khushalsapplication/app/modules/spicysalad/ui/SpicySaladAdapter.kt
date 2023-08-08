package com.khushalsapplication.app.modules.spicysalad.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSpicySaladBinding
import com.khushalsapplication.app.modules.spicysalad.`data`.model.SpicySaladRowModel
import kotlin.Int
import kotlin.collections.List

class SpicySaladAdapter(
  var list: List<SpicySaladRowModel>
) : RecyclerView.Adapter<SpicySaladAdapter.RowSpicySaladVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSpicySaladVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_spicy_salad,parent,false)
    return RowSpicySaladVH(view)
  }

  override fun onBindViewHolder(holder: RowSpicySaladVH, position: Int) {
    val spicySaladRowModel = SpicySaladRowModel()
    // TODO uncomment following line after integration with data source
    // val spicySaladRowModel = list[position]
    holder.binding.spicySaladRowModel = spicySaladRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SpicySaladRowModel>) {
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
      item: SpicySaladRowModel
    ) {
    }
  }

  inner class RowSpicySaladVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSpicySaladBinding = RowSpicySaladBinding.bind(itemView)
  }
}
