package com.khushalsapplication.app.modules.pavbhaji.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPavBhajiBinding
import com.khushalsapplication.app.modules.pavbhaji.`data`.model.PavBhajiRowModel
import kotlin.Int
import kotlin.collections.List

class PavBhajiAdapter(
  var list: List<PavBhajiRowModel>
) : RecyclerView.Adapter<PavBhajiAdapter.RowPavBhajiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPavBhajiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pav_bhaji,parent,false)
    return RowPavBhajiVH(view)
  }

  override fun onBindViewHolder(holder: RowPavBhajiVH, position: Int) {
    val pavBhajiRowModel = PavBhajiRowModel()
    // TODO uncomment following line after integration with data source
    // val pavBhajiRowModel = list[position]
    holder.binding.pavBhajiRowModel = pavBhajiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PavBhajiRowModel>) {
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
      item: PavBhajiRowModel
    ) {
    }
  }

  inner class RowPavBhajiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPavBhajiBinding = RowPavBhajiBinding.bind(itemView)
  }
}
