package com.khushalsapplication.app.modules.tirmisu.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowTirmisuBinding
import com.khushalsapplication.app.modules.tirmisu.`data`.model.TirmisuRowModel
import kotlin.Int
import kotlin.collections.List

class TirmisuAdapter(
  var list: List<TirmisuRowModel>
) : RecyclerView.Adapter<TirmisuAdapter.RowTirmisuVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTirmisuVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tirmisu,parent,false)
    return RowTirmisuVH(view)
  }

  override fun onBindViewHolder(holder: RowTirmisuVH, position: Int) {
    val tirmisuRowModel = TirmisuRowModel()
    // TODO uncomment following line after integration with data source
    // val tirmisuRowModel = list[position]
    holder.binding.tirmisuRowModel = tirmisuRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TirmisuRowModel>) {
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
      item: TirmisuRowModel
    ) {
    }
  }

  inner class RowTirmisuVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTirmisuBinding = RowTirmisuBinding.bind(itemView)
  }
}
