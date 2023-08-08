package com.khushalsapplication.app.modules.corndogs.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowCornDogsBinding
import com.khushalsapplication.app.modules.corndogs.`data`.model.CornDogsRowModel
import kotlin.Int
import kotlin.collections.List

class CornDogsAdapter(
  var list: List<CornDogsRowModel>
) : RecyclerView.Adapter<CornDogsAdapter.RowCornDogsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCornDogsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_corn_dogs,parent,false)
    return RowCornDogsVH(view)
  }

  override fun onBindViewHolder(holder: RowCornDogsVH, position: Int) {
    val cornDogsRowModel = CornDogsRowModel()
    // TODO uncomment following line after integration with data source
    // val cornDogsRowModel = list[position]
    holder.binding.cornDogsRowModel = cornDogsRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CornDogsRowModel>) {
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
      item: CornDogsRowModel
    ) {
    }
  }

  inner class RowCornDogsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCornDogsBinding = RowCornDogsBinding.bind(itemView)
  }
}
