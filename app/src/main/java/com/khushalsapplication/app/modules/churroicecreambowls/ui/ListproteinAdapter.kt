package com.khushalsapplication.app.modules.churroicecreambowls.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein10Binding
import com.khushalsapplication.app.modules.churroicecreambowls.`data`.model.Listprotein10RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein10RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein10VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein10VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein10,parent,false)
    return RowListprotein10VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein10VH, position: Int) {
    val listprotein10RowModel = Listprotein10RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein10RowModel = list[position]
    holder.binding.listprotein10RowModel = listprotein10RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein10RowModel>) {
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
      item: Listprotein10RowModel
    ) {
    }
  }

  inner class RowListprotein10VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein10Binding = RowListprotein10Binding.bind(itemView)
  }
}
