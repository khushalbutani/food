package com.khushalsapplication.app.modules.mozzacheese.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowMozzaCheeseBinding
import com.khushalsapplication.app.modules.mozzacheese.`data`.model.MozzaCheeseRowModel
import kotlin.Int
import kotlin.collections.List

class MozzaCheeseAdapter(
  var list: List<MozzaCheeseRowModel>
) : RecyclerView.Adapter<MozzaCheeseAdapter.RowMozzaCheeseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMozzaCheeseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mozza_cheese,parent,false)
    return RowMozzaCheeseVH(view)
  }

  override fun onBindViewHolder(holder: RowMozzaCheeseVH, position: Int) {
    val mozzaCheeseRowModel = MozzaCheeseRowModel()
    // TODO uncomment following line after integration with data source
    // val mozzaCheeseRowModel = list[position]
    holder.binding.mozzaCheeseRowModel = mozzaCheeseRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MozzaCheeseRowModel>) {
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
      item: MozzaCheeseRowModel
    ) {
    }
  }

  inner class RowMozzaCheeseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMozzaCheeseBinding = RowMozzaCheeseBinding.bind(itemView)
  }
}
