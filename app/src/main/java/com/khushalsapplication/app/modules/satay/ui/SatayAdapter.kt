package com.khushalsapplication.app.modules.satay.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSatayBinding
import com.khushalsapplication.app.modules.satay.`data`.model.SatayRowModel
import kotlin.Int
import kotlin.collections.List

class SatayAdapter(
  var list: List<SatayRowModel>
) : RecyclerView.Adapter<SatayAdapter.RowSatayVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSatayVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_satay,parent,false)
    return RowSatayVH(view)
  }

  override fun onBindViewHolder(holder: RowSatayVH, position: Int) {
    val satayRowModel = SatayRowModel()
    // TODO uncomment following line after integration with data source
    // val satayRowModel = list[position]
    holder.binding.satayRowModel = satayRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SatayRowModel>) {
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
      item: SatayRowModel
    ) {
    }
  }

  inner class RowSatayVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSatayBinding = RowSatayBinding.bind(itemView)
  }
}
