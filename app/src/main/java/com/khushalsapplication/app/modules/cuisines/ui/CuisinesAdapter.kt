package com.khushalsapplication.app.modules.cuisines.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowCuisinesBinding
import com.khushalsapplication.app.modules.cuisines.`data`.model.CuisinesRowModel
import kotlin.Int
import kotlin.collections.List

class CuisinesAdapter(
  var list: List<CuisinesRowModel>
) : RecyclerView.Adapter<CuisinesAdapter.RowCuisinesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCuisinesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cuisines,parent,false)
    return RowCuisinesVH(view)
  }

  override fun onBindViewHolder(holder: RowCuisinesVH, position: Int) {
    val cuisinesRowModel = CuisinesRowModel()
    // TODO uncomment following line after integration with data source
    // val cuisinesRowModel = list[position]
    holder.binding.cuisinesRowModel = cuisinesRowModel
  }

  override fun getItemCount(): Int = 11
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CuisinesRowModel>) {
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
      item: CuisinesRowModel
    ) {
    }
  }

  inner class RowCuisinesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCuisinesBinding = RowCuisinesBinding.bind(itemView)
    init {
      binding.imageRectangle117.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, CuisinesRowModel())
      }
    }
  }
}
