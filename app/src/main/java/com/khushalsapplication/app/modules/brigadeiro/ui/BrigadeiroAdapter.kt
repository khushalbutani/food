package com.khushalsapplication.app.modules.brigadeiro.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBrigadeiroBinding
import com.khushalsapplication.app.modules.brigadeiro.`data`.model.BrigadeiroRowModel
import kotlin.Int
import kotlin.collections.List

class BrigadeiroAdapter(
  var list: List<BrigadeiroRowModel>
) : RecyclerView.Adapter<BrigadeiroAdapter.RowBrigadeiroVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBrigadeiroVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_brigadeiro,parent,false)
    return RowBrigadeiroVH(view)
  }

  override fun onBindViewHolder(holder: RowBrigadeiroVH, position: Int) {
    val brigadeiroRowModel = BrigadeiroRowModel()
    // TODO uncomment following line after integration with data source
    // val brigadeiroRowModel = list[position]
    holder.binding.brigadeiroRowModel = brigadeiroRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BrigadeiroRowModel>) {
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
      item: BrigadeiroRowModel
    ) {
    }
  }

  inner class RowBrigadeiroVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBrigadeiroBinding = RowBrigadeiroBinding.bind(itemView)
  }
}
