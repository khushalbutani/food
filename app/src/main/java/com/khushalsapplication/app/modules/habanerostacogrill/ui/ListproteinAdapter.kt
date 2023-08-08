package com.khushalsapplication.app.modules.habanerostacogrill.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein7Binding
import com.khushalsapplication.app.modules.habanerostacogrill.`data`.model.Listprotein7RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein7RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein7VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein7VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein7,parent,false)
    return RowListprotein7VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein7VH, position: Int) {
    val listprotein7RowModel = Listprotein7RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein7RowModel = list[position]
    holder.binding.listprotein7RowModel = listprotein7RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein7RowModel>) {
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
      item: Listprotein7RowModel
    ) {
    }
  }

  inner class RowListprotein7VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein7Binding = RowListprotein7Binding.bind(itemView)
  }
}
