package com.khushalsapplication.app.modules.onioncheese.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowOnionCheeseBinding
import com.khushalsapplication.app.modules.onioncheese.`data`.model.OnionCheeseRowModel
import kotlin.Int
import kotlin.collections.List

class OnionCheeseAdapter(
  var list: List<OnionCheeseRowModel>
) : RecyclerView.Adapter<OnionCheeseAdapter.RowOnionCheeseVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowOnionCheeseVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_onion_cheese,parent,false)
    return RowOnionCheeseVH(view)
  }

  override fun onBindViewHolder(holder: RowOnionCheeseVH, position: Int) {
    val onionCheeseRowModel = OnionCheeseRowModel()
    // TODO uncomment following line after integration with data source
    // val onionCheeseRowModel = list[position]
    holder.binding.onionCheeseRowModel = onionCheeseRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<OnionCheeseRowModel>) {
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
      item: OnionCheeseRowModel
    ) {
    }
  }

  inner class RowOnionCheeseVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowOnionCheeseBinding = RowOnionCheeseBinding.bind(itemView)
  }
}
