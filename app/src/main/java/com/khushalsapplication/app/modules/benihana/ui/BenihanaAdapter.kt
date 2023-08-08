package com.khushalsapplication.app.modules.benihana.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBenihanaBinding
import com.khushalsapplication.app.modules.benihana.`data`.model.BenihanaRowModel
import kotlin.Int
import kotlin.collections.List

class BenihanaAdapter(
  var list: List<BenihanaRowModel>
) : RecyclerView.Adapter<BenihanaAdapter.RowBenihanaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBenihanaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_benihana,parent,false)
    return RowBenihanaVH(view)
  }

  override fun onBindViewHolder(holder: RowBenihanaVH, position: Int) {
    val benihanaRowModel = BenihanaRowModel()
    // TODO uncomment following line after integration with data source
    // val benihanaRowModel = list[position]
    holder.binding.benihanaRowModel = benihanaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BenihanaRowModel>) {
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
      item: BenihanaRowModel
    ) {
    }
  }

  inner class RowBenihanaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBenihanaBinding = RowBenihanaBinding.bind(itemView)
  }
}
