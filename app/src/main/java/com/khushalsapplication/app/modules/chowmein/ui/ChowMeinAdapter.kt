package com.khushalsapplication.app.modules.chowmein.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowChowMeinBinding
import com.khushalsapplication.app.modules.chowmein.`data`.model.ChowMeinRowModel
import kotlin.Int
import kotlin.collections.List

class ChowMeinAdapter(
  var list: List<ChowMeinRowModel>
) : RecyclerView.Adapter<ChowMeinAdapter.RowChowMeinVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowChowMeinVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_chow_mein,parent,false)
    return RowChowMeinVH(view)
  }

  override fun onBindViewHolder(holder: RowChowMeinVH, position: Int) {
    val chowMeinRowModel = ChowMeinRowModel()
    // TODO uncomment following line after integration with data source
    // val chowMeinRowModel = list[position]
    holder.binding.chowMeinRowModel = chowMeinRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ChowMeinRowModel>) {
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
      item: ChowMeinRowModel
    ) {
    }
  }

  inner class RowChowMeinVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowChowMeinBinding = RowChowMeinBinding.bind(itemView)
  }
}
