package com.khushalsapplication.app.modules.pavbhajione.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPavBhajiOneBinding
import com.khushalsapplication.app.modules.pavbhajione.`data`.model.PavBhajiOneRowModel
import kotlin.Int
import kotlin.collections.List

class PavBhajiOneAdapter(
  var list: List<PavBhajiOneRowModel>
) : RecyclerView.Adapter<PavBhajiOneAdapter.RowPavBhajiOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPavBhajiOneVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pav_bhaji_one,parent,false)
    return RowPavBhajiOneVH(view)
  }

  override fun onBindViewHolder(holder: RowPavBhajiOneVH, position: Int) {
    val pavBhajiOneRowModel = PavBhajiOneRowModel()
    // TODO uncomment following line after integration with data source
    // val pavBhajiOneRowModel = list[position]
    holder.binding.pavBhajiOneRowModel = pavBhajiOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PavBhajiOneRowModel>) {
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
      item: PavBhajiOneRowModel
    ) {
    }
  }

  inner class RowPavBhajiOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPavBhajiOneBinding = RowPavBhajiOneBinding.bind(itemView)
  }
}
