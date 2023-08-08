package com.khushalsapplication.app.modules.moltenchocolatecake.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein4Binding
import com.khushalsapplication.app.modules.moltenchocolatecake.`data`.model.Listprotein4RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein4RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein4VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein4,parent,false)
    return RowListprotein4VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein4VH, position: Int) {
    val listprotein4RowModel = Listprotein4RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein4RowModel = list[position]
    holder.binding.listprotein4RowModel = listprotein4RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein4RowModel>) {
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
      item: Listprotein4RowModel
    ) {
    }
  }

  inner class RowListprotein4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein4Binding = RowListprotein4Binding.bind(itemView)
  }
}
