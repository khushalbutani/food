package com.khushalsapplication.app.modules.focaccia.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowFocacciaBinding
import com.khushalsapplication.app.modules.focaccia.`data`.model.FocacciaRowModel
import kotlin.Int
import kotlin.collections.List

class FocacciaAdapter(
  var list: List<FocacciaRowModel>
) : RecyclerView.Adapter<FocacciaAdapter.RowFocacciaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFocacciaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_focaccia,parent,false)
    return RowFocacciaVH(view)
  }

  override fun onBindViewHolder(holder: RowFocacciaVH, position: Int) {
    val focacciaRowModel = FocacciaRowModel()
    // TODO uncomment following line after integration with data source
    // val focacciaRowModel = list[position]
    holder.binding.focacciaRowModel = focacciaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FocacciaRowModel>) {
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
      item: FocacciaRowModel
    ) {
    }
  }

  inner class RowFocacciaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFocacciaBinding = RowFocacciaBinding.bind(itemView)
  }
}
