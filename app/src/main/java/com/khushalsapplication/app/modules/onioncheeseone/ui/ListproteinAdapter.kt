package com.khushalsapplication.app.modules.onioncheeseone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein6Binding
import com.khushalsapplication.app.modules.onioncheeseone.`data`.model.Listprotein6RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein6RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein6VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein6VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein6,parent,false)
    return RowListprotein6VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein6VH, position: Int) {
    val listprotein6RowModel = Listprotein6RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein6RowModel = list[position]
    holder.binding.listprotein6RowModel = listprotein6RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein6RowModel>) {
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
      item: Listprotein6RowModel
    ) {
    }
  }

  inner class RowListprotein6VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein6Binding = RowListprotein6Binding.bind(itemView)
  }
}
