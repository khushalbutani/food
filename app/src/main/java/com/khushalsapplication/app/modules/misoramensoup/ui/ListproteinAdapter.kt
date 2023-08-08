package com.khushalsapplication.app.modules.misoramensoup.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein5Binding
import com.khushalsapplication.app.modules.misoramensoup.`data`.model.Listprotein5RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein5RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein5VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein5VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein5,parent,false)
    return RowListprotein5VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein5VH, position: Int) {
    val listprotein5RowModel = Listprotein5RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein5RowModel = list[position]
    holder.binding.listprotein5RowModel = listprotein5RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein5RowModel>) {
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
      item: Listprotein5RowModel
    ) {
    }
  }

  inner class RowListprotein5VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein5Binding = RowListprotein5Binding.bind(itemView)
  }
}
