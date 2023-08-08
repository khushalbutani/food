package com.khushalsapplication.app.modules.singapore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSingaporeBinding
import com.khushalsapplication.app.modules.singapore.`data`.model.SingaporeRowModel
import kotlin.Int
import kotlin.collections.List

class SingaporeAdapter(
  var list: List<SingaporeRowModel>
) : RecyclerView.Adapter<SingaporeAdapter.RowSingaporeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSingaporeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_singapore,parent,false)
    return RowSingaporeVH(view)
  }

  override fun onBindViewHolder(holder: RowSingaporeVH, position: Int) {
    val singaporeRowModel = SingaporeRowModel()
    // TODO uncomment following line after integration with data source
    // val singaporeRowModel = list[position]
    holder.binding.singaporeRowModel = singaporeRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SingaporeRowModel>) {
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
      item: SingaporeRowModel
    ) {
    }
  }

  inner class RowSingaporeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSingaporeBinding = RowSingaporeBinding.bind(itemView)
  }
}
