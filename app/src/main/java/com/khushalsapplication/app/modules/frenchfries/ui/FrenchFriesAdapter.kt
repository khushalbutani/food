package com.khushalsapplication.app.modules.frenchfries.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowFrenchFriesBinding
import com.khushalsapplication.app.modules.frenchfries.`data`.model.FrenchFriesRowModel
import kotlin.Int
import kotlin.collections.List

class FrenchFriesAdapter(
  var list: List<FrenchFriesRowModel>
) : RecyclerView.Adapter<FrenchFriesAdapter.RowFrenchFriesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFrenchFriesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_french_fries,parent,false)
    return RowFrenchFriesVH(view)
  }

  override fun onBindViewHolder(holder: RowFrenchFriesVH, position: Int) {
    val frenchFriesRowModel = FrenchFriesRowModel()
    // TODO uncomment following line after integration with data source
    // val frenchFriesRowModel = list[position]
    holder.binding.frenchFriesRowModel = frenchFriesRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FrenchFriesRowModel>) {
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
      item: FrenchFriesRowModel
    ) {
    }
  }

  inner class RowFrenchFriesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFrenchFriesBinding = RowFrenchFriesBinding.bind(itemView)
  }
}
