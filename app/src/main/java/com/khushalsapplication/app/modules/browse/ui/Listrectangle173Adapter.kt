package com.khushalsapplication.app.modules.browse.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListrectangle173Binding
import com.khushalsapplication.app.modules.browse.`data`.model.Listrectangle173RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle173Adapter(
  var list: List<Listrectangle173RowModel>
) : RecyclerView.Adapter<Listrectangle173Adapter.RowListrectangle173VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle173VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle173,parent,false)
    return RowListrectangle173VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle173VH, position: Int) {
    val listrectangle173RowModel = Listrectangle173RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle173RowModel = list[position]
    holder.binding.listrectangle173RowModel = listrectangle173RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle173RowModel>) {
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
      item: Listrectangle173RowModel
    ) {
    }
  }

  inner class RowListrectangle173VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle173Binding = RowListrectangle173Binding.bind(itemView)
  }
}
