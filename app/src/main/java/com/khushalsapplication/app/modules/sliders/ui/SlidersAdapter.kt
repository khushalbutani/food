package com.khushalsapplication.app.modules.sliders.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSlidersBinding
import com.khushalsapplication.app.modules.sliders.`data`.model.SlidersRowModel
import kotlin.Int
import kotlin.collections.List

class SlidersAdapter(
  var list: List<SlidersRowModel>
) : RecyclerView.Adapter<SlidersAdapter.RowSlidersVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSlidersVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_sliders,parent,false)
    return RowSlidersVH(view)
  }

  override fun onBindViewHolder(holder: RowSlidersVH, position: Int) {
    val slidersRowModel = SlidersRowModel()
    // TODO uncomment following line after integration with data source
    // val slidersRowModel = list[position]
    holder.binding.slidersRowModel = slidersRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SlidersRowModel>) {
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
      item: SlidersRowModel
    ) {
    }
  }

  inner class RowSlidersVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSlidersBinding = RowSlidersBinding.bind(itemView)
  }
}
