package com.khushalsapplication.app.modules.thai.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowThaiBinding
import com.khushalsapplication.app.modules.thai.`data`.model.ThaiRowModel
import kotlin.Int
import kotlin.collections.List

class ThaiAdapter(
  var list: List<ThaiRowModel>
) : RecyclerView.Adapter<ThaiAdapter.RowThaiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowThaiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_thai,parent,false)
    return RowThaiVH(view)
  }

  override fun onBindViewHolder(holder: RowThaiVH, position: Int) {
    val thaiRowModel = ThaiRowModel()
    // TODO uncomment following line after integration with data source
    // val thaiRowModel = list[position]
    holder.binding.thaiRowModel = thaiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ThaiRowModel>) {
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
      item: ThaiRowModel
    ) {
    }
  }

  inner class RowThaiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowThaiBinding = RowThaiBinding.bind(itemView)
  }
}
