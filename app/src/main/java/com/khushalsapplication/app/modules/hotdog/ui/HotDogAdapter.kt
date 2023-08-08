package com.khushalsapplication.app.modules.hotdog.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowHotDogBinding
import com.khushalsapplication.app.modules.hotdog.`data`.model.HotDogRowModel
import kotlin.Int
import kotlin.collections.List

class HotDogAdapter(
  var list: List<HotDogRowModel>
) : RecyclerView.Adapter<HotDogAdapter.RowHotDogVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHotDogVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_hot_dog,parent,false)
    return RowHotDogVH(view)
  }

  override fun onBindViewHolder(holder: RowHotDogVH, position: Int) {
    val hotDogRowModel = HotDogRowModel()
    // TODO uncomment following line after integration with data source
    // val hotDogRowModel = list[position]
    holder.binding.hotDogRowModel = hotDogRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<HotDogRowModel>) {
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
      item: HotDogRowModel
    ) {
    }
  }

  inner class RowHotDogVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowHotDogBinding = RowHotDogBinding.bind(itemView)
  }
}
