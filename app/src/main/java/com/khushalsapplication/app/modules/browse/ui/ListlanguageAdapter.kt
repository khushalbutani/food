package com.khushalsapplication.app.modules.browse.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListlanguageBinding
import com.khushalsapplication.app.modules.browse.`data`.model.ListlanguageRowModel
import kotlin.Int
import kotlin.collections.List

class ListlanguageAdapter(
  var list: List<ListlanguageRowModel>
) : RecyclerView.Adapter<ListlanguageAdapter.RowListlanguageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlanguageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlanguage,parent,false)
    return RowListlanguageVH(view)
  }

  override fun onBindViewHolder(holder: RowListlanguageVH, position: Int) {
    val listlanguageRowModel = ListlanguageRowModel()
    // TODO uncomment following line after integration with data source
    // val listlanguageRowModel = list[position]
    holder.binding.listlanguageRowModel = listlanguageRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlanguageRowModel>) {
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
      item: ListlanguageRowModel
    ) {
    }
  }

  inner class RowListlanguageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlanguageBinding = RowListlanguageBinding.bind(itemView)
  }
}
