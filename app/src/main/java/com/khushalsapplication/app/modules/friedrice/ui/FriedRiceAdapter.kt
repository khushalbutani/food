package com.khushalsapplication.app.modules.friedrice.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowFriedRiceBinding
import com.khushalsapplication.app.modules.friedrice.`data`.model.FriedRiceRowModel
import kotlin.Int
import kotlin.collections.List

class FriedRiceAdapter(
  var list: List<FriedRiceRowModel>
) : RecyclerView.Adapter<FriedRiceAdapter.RowFriedRiceVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFriedRiceVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_fried_rice,parent,false)
    return RowFriedRiceVH(view)
  }

  override fun onBindViewHolder(holder: RowFriedRiceVH, position: Int) {
    val friedRiceRowModel = FriedRiceRowModel()
    // TODO uncomment following line after integration with data source
    // val friedRiceRowModel = list[position]
    holder.binding.friedRiceRowModel = friedRiceRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FriedRiceRowModel>) {
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
      item: FriedRiceRowModel
    ) {
    }
  }

  inner class RowFriedRiceVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFriedRiceBinding = RowFriedRiceBinding.bind(itemView)
  }
}
