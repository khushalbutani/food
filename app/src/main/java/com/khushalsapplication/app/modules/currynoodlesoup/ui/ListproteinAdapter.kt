package com.khushalsapplication.app.modules.currynoodlesoup.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein8Binding
import com.khushalsapplication.app.modules.currynoodlesoup.`data`.model.Listprotein8RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein8RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein8VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein8VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein8,parent,false)
    return RowListprotein8VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein8VH, position: Int) {
    val listprotein8RowModel = Listprotein8RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein8RowModel = list[position]
    holder.binding.listprotein8RowModel = listprotein8RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein8RowModel>) {
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
      item: Listprotein8RowModel
    ) {
    }
  }

  inner class RowListprotein8VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein8Binding = RowListprotein8Binding.bind(itemView)
  }
}
