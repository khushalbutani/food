package com.khushalsapplication.app.modules.japanese.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowJapaneseBinding
import com.khushalsapplication.app.modules.japanese.`data`.model.JapaneseRowModel
import kotlin.Int
import kotlin.collections.List

class JapaneseAdapter(
  var list: List<JapaneseRowModel>
) : RecyclerView.Adapter<JapaneseAdapter.RowJapaneseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowJapaneseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_japanese,parent,false)
    return RowJapaneseVH(view)
  }

  override fun onBindViewHolder(holder: RowJapaneseVH, position: Int) {
    val japaneseRowModel = JapaneseRowModel()
    // TODO uncomment following line after integration with data source
    // val japaneseRowModel = list[position]
    holder.binding.japaneseRowModel = japaneseRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<JapaneseRowModel>) {
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
      item: JapaneseRowModel
    ) {
    }
  }

  inner class RowJapaneseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowJapaneseBinding = RowJapaneseBinding.bind(itemView)
  }
}
