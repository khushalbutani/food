package com.khushalsapplication.app.modules.indian.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowIndianBinding
import com.khushalsapplication.app.modules.indian.`data`.model.IndianRowModel
import kotlin.Int
import kotlin.collections.List

class IndianAdapter(
  var list: List<IndianRowModel>
) : RecyclerView.Adapter<IndianAdapter.RowIndianVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIndianVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_indian,parent,false)
    return RowIndianVH(view)
  }

  override fun onBindViewHolder(holder: RowIndianVH, position: Int) {
    val indianRowModel = IndianRowModel()
    // TODO uncomment following line after integration with data source
    // val indianRowModel = list[position]
    holder.binding.indianRowModel = indianRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IndianRowModel>) {
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
      item: IndianRowModel
    ) {
    }
  }

  inner class RowIndianVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowIndianBinding = RowIndianBinding.bind(itemView)
  }
}
