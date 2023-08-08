package com.khushalsapplication.app.modules.muttonkeemasamosa.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein9Binding
import com.khushalsapplication.app.modules.muttonkeemasamosa.`data`.model.Listprotein9RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein9RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein9VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein9VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein9,parent,false)
    return RowListprotein9VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein9VH, position: Int) {
    val listprotein9RowModel = Listprotein9RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein9RowModel = list[position]
    holder.binding.listprotein9RowModel = listprotein9RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein9RowModel>) {
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
      item: Listprotein9RowModel
    ) {
    }
  }

  inner class RowListprotein9VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein9Binding = RowListprotein9Binding.bind(itemView)
  }
}
