package com.khushalsapplication.app.modules.boloderolo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBoloDeRoloBinding
import com.khushalsapplication.app.modules.boloderolo.`data`.model.BoloDeRoloRowModel
import kotlin.Int
import kotlin.collections.List

class BoloDeRoloAdapter(
  var list: List<BoloDeRoloRowModel>
) : RecyclerView.Adapter<BoloDeRoloAdapter.RowBoloDeRoloVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBoloDeRoloVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_bolo_de_rolo,parent,false)
    return RowBoloDeRoloVH(view)
  }

  override fun onBindViewHolder(holder: RowBoloDeRoloVH, position: Int) {
    val boloDeRoloRowModel = BoloDeRoloRowModel()
    // TODO uncomment following line after integration with data source
    // val boloDeRoloRowModel = list[position]
    holder.binding.boloDeRoloRowModel = boloDeRoloRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BoloDeRoloRowModel>) {
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
      item: BoloDeRoloRowModel
    ) {
    }
  }

  inner class RowBoloDeRoloVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBoloDeRoloBinding = RowBoloDeRoloBinding.bind(itemView)
  }
}
