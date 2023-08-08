package com.khushalsapplication.app.modules.rotiprata.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowRotiPrataBinding
import com.khushalsapplication.app.modules.rotiprata.`data`.model.RotiPrataRowModel
import kotlin.Int
import kotlin.collections.List

class RotiPrataAdapter(
  var list: List<RotiPrataRowModel>
) : RecyclerView.Adapter<RotiPrataAdapter.RowRotiPrataVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRotiPrataVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_roti_prata,parent,false)
    return RowRotiPrataVH(view)
  }

  override fun onBindViewHolder(holder: RowRotiPrataVH, position: Int) {
    val rotiPrataRowModel = RotiPrataRowModel()
    // TODO uncomment following line after integration with data source
    // val rotiPrataRowModel = list[position]
    holder.binding.rotiPrataRowModel = rotiPrataRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RotiPrataRowModel>) {
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
      item: RotiPrataRowModel
    ) {
    }
  }

  inner class RowRotiPrataVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRotiPrataBinding = RowRotiPrataBinding.bind(itemView)
  }
}
