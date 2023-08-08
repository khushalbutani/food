package com.khushalsapplication.app.modules.muffintinminiquiche.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein3Binding
import com.khushalsapplication.app.modules.muffintinminiquiche.`data`.model.Listprotein3RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein3RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein3VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein3VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein3,parent,false)
    return RowListprotein3VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein3VH, position: Int) {
    val listprotein3RowModel = Listprotein3RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein3RowModel = list[position]
    holder.binding.listprotein3RowModel = listprotein3RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein3RowModel>) {
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
      item: Listprotein3RowModel
    ) {
    }
  }

  inner class RowListprotein3VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein3Binding = RowListprotein3Binding.bind(itemView)
  }
}
