package com.khushalsapplication.app.modules.pasta.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPastaBinding
import com.khushalsapplication.app.modules.pasta.`data`.model.PastaRowModel
import kotlin.Int
import kotlin.collections.List

class PastaAdapter(
  var list: List<PastaRowModel>
) : RecyclerView.Adapter<PastaAdapter.RowPastaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPastaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pasta,parent,false)
    return RowPastaVH(view)
  }

  override fun onBindViewHolder(holder: RowPastaVH, position: Int) {
    val pastaRowModel = PastaRowModel()
    // TODO uncomment following line after integration with data source
    // val pastaRowModel = list[position]
    holder.binding.pastaRowModel = pastaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PastaRowModel>) {
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
      item: PastaRowModel
    ) {
    }
  }

  inner class RowPastaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPastaBinding = RowPastaBinding.bind(itemView)
  }
}
