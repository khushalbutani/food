package com.khushalsapplication.app.modules.chinese.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowChineseBinding
import com.khushalsapplication.app.modules.chinese.`data`.model.ChineseRowModel
import kotlin.Int
import kotlin.collections.List

class ChineseAdapter(
  var list: List<ChineseRowModel>
) : RecyclerView.Adapter<ChineseAdapter.RowChineseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChineseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chinese,parent,false)
    return RowChineseVH(view)
  }

  override fun onBindViewHolder(holder: RowChineseVH, position: Int) {
    val chineseRowModel = ChineseRowModel()
    // TODO uncomment following line after integration with data source
    // val chineseRowModel = list[position]
    holder.binding.chineseRowModel = chineseRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChineseRowModel>) {
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
      item: ChineseRowModel
    ) {
    }
  }

  inner class RowChineseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChineseBinding = RowChineseBinding.bind(itemView)
  }
}
