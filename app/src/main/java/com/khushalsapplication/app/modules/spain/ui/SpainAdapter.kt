package com.khushalsapplication.app.modules.spain.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSpainBinding
import com.khushalsapplication.app.modules.spain.`data`.model.SpainRowModel
import kotlin.Int
import kotlin.collections.List

class SpainAdapter(
  var list: List<SpainRowModel>
) : RecyclerView.Adapter<SpainAdapter.RowSpainVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSpainVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_spain,parent,false)
    return RowSpainVH(view)
  }

  override fun onBindViewHolder(holder: RowSpainVH, position: Int) {
    val spainRowModel = SpainRowModel()
    // TODO uncomment following line after integration with data source
    // val spainRowModel = list[position]
    holder.binding.spainRowModel = spainRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SpainRowModel>) {
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
      item: SpainRowModel
    ) {
    }
  }

  inner class RowSpainVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSpainBinding = RowSpainBinding.bind(itemView)
  }
}
