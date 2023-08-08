package com.khushalsapplication.app.modules.italian.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowItalianBinding
import com.khushalsapplication.app.modules.italian.`data`.model.ItalianRowModel
import kotlin.Int
import kotlin.collections.List

class ItalianAdapter(
  var list: List<ItalianRowModel>
) : RecyclerView.Adapter<ItalianAdapter.RowItalianVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowItalianVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_italian,parent,false)
    return RowItalianVH(view)
  }

  override fun onBindViewHolder(holder: RowItalianVH, position: Int) {
    val italianRowModel = ItalianRowModel()
    // TODO uncomment following line after integration with data source
    // val italianRowModel = list[position]
    holder.binding.italianRowModel = italianRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ItalianRowModel>) {
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
      item: ItalianRowModel
    ) {
    }
  }

  inner class RowItalianVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowItalianBinding = RowItalianBinding.bind(itemView)
    init {
      binding.linearRowrectangleeightyone.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ItalianRowModel())
      }
    }
  }
}
