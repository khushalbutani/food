package com.khushalsapplication.app.modules.momos.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowMomosBinding
import com.khushalsapplication.app.modules.momos.`data`.model.MomosRowModel
import kotlin.Int
import kotlin.collections.List

class MomosAdapter(
  var list: List<MomosRowModel>
) : RecyclerView.Adapter<MomosAdapter.RowMomosVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMomosVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_momos,parent,false)
    return RowMomosVH(view)
  }

  override fun onBindViewHolder(holder: RowMomosVH, position: Int) {
    val momosRowModel = MomosRowModel()
    // TODO uncomment following line after integration with data source
    // val momosRowModel = list[position]
    holder.binding.momosRowModel = momosRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MomosRowModel>) {
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
      item: MomosRowModel
    ) {
    }
  }

  inner class RowMomosVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMomosBinding = RowMomosBinding.bind(itemView)
  }
}
