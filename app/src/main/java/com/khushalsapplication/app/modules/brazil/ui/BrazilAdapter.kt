package com.khushalsapplication.app.modules.brazil.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBrazilBinding
import com.khushalsapplication.app.modules.brazil.`data`.model.BrazilRowModel
import kotlin.Int
import kotlin.collections.List

class BrazilAdapter(
  var list: List<BrazilRowModel>
) : RecyclerView.Adapter<BrazilAdapter.RowBrazilVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBrazilVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_brazil,parent,false)
    return RowBrazilVH(view)
  }

  override fun onBindViewHolder(holder: RowBrazilVH, position: Int) {
    val brazilRowModel = BrazilRowModel()
    // TODO uncomment following line after integration with data source
    // val brazilRowModel = list[position]
    holder.binding.brazilRowModel = brazilRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BrazilRowModel>) {
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
      item: BrazilRowModel
    ) {
    }
  }

  inner class RowBrazilVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBrazilBinding = RowBrazilBinding.bind(itemView)
  }
}
