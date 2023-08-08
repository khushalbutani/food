package com.khushalsapplication.app.modules.browse.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListriverbambooBinding
import com.khushalsapplication.app.modules.browse.`data`.model.ListriverbambooRowModel
import kotlin.Int
import kotlin.collections.List

class ListriverbambooAdapter(
  var list: List<ListriverbambooRowModel>
) : RecyclerView.Adapter<ListriverbambooAdapter.RowListriverbambooVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListriverbambooVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listriverbamboo,parent,false)
    return RowListriverbambooVH(view)
  }

  override fun onBindViewHolder(holder: RowListriverbambooVH, position: Int) {
    val listriverbambooRowModel = ListriverbambooRowModel()
    // TODO uncomment following line after integration with data source
    // val listriverbambooRowModel = list[position]
    holder.binding.listriverbambooRowModel = listriverbambooRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListriverbambooRowModel>) {
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
      item: ListriverbambooRowModel
    ) {
    }
  }

  inner class RowListriverbambooVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListriverbambooBinding = RowListriverbambooBinding.bind(itemView)
  }
}
