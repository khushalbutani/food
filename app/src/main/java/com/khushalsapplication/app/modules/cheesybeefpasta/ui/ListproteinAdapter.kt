package com.khushalsapplication.app.modules.cheesybeefpasta.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein1Binding
import com.khushalsapplication.app.modules.cheesybeefpasta.`data`.model.Listprotein1RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein1RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein1,parent,false)
    return RowListprotein1VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein1VH, position: Int) {
    val listprotein1RowModel = Listprotein1RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein1RowModel = list[position]
    holder.binding.listprotein1RowModel = listprotein1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein1RowModel>) {
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
      item: Listprotein1RowModel
    ) {
    }
  }

  inner class RowListprotein1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein1Binding = RowListprotein1Binding.bind(itemView)
  }
}
