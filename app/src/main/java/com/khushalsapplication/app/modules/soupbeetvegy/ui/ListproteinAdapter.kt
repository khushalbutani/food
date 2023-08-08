package com.khushalsapplication.app.modules.soupbeetvegy.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListproteinBinding
import com.khushalsapplication.app.modules.soupbeetvegy.`data`.model.ListproteinRowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<ListproteinRowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListproteinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListproteinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein,parent,false)
    return RowListproteinVH(view)
  }

  override fun onBindViewHolder(holder: RowListproteinVH, position: Int) {
    val listproteinRowModel = ListproteinRowModel()
    // TODO uncomment following line after integration with data source
    // val listproteinRowModel = list[position]
    holder.binding.listproteinRowModel = listproteinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListproteinRowModel>) {
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
      item: ListproteinRowModel
    ) {
    }
  }

  inner class RowListproteinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListproteinBinding = RowListproteinBinding.bind(itemView)
  }
}
