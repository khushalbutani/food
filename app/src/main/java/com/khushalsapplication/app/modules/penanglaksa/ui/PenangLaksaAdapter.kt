package com.khushalsapplication.app.modules.penanglaksa.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPenangLaksaBinding
import com.khushalsapplication.app.modules.penanglaksa.`data`.model.PenangLaksaRowModel
import kotlin.Int
import kotlin.collections.List

class PenangLaksaAdapter(
  var list: List<PenangLaksaRowModel>
) : RecyclerView.Adapter<PenangLaksaAdapter.RowPenangLaksaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPenangLaksaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_penang_laksa,parent,false)
    return RowPenangLaksaVH(view)
  }

  override fun onBindViewHolder(holder: RowPenangLaksaVH, position: Int) {
    val penangLaksaRowModel = PenangLaksaRowModel()
    // TODO uncomment following line after integration with data source
    // val penangLaksaRowModel = list[position]
    holder.binding.penangLaksaRowModel = penangLaksaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PenangLaksaRowModel>) {
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
      item: PenangLaksaRowModel
    ) {
    }
  }

  inner class RowPenangLaksaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPenangLaksaBinding = RowPenangLaksaBinding.bind(itemView)
  }
}
