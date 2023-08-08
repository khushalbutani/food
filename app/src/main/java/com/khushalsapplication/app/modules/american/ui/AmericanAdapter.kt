package com.khushalsapplication.app.modules.american.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowAmericanBinding
import com.khushalsapplication.app.modules.american.`data`.model.AmericanRowModel
import kotlin.Int
import kotlin.collections.List

class AmericanAdapter(
  var list: List<AmericanRowModel>
) : RecyclerView.Adapter<AmericanAdapter.RowAmericanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAmericanVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_american,parent,false)
    return RowAmericanVH(view)
  }

  override fun onBindViewHolder(holder: RowAmericanVH, position: Int) {
    val americanRowModel = AmericanRowModel()
    // TODO uncomment following line after integration with data source
    // val americanRowModel = list[position]
    holder.binding.americanRowModel = americanRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AmericanRowModel>) {
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
      item: AmericanRowModel
    ) {
    }
  }

  inner class RowAmericanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAmericanBinding = RowAmericanBinding.bind(itemView)
  }
}
