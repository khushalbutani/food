package com.khushalsapplication.app.modules.biriyani.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBiriyaniBinding
import com.khushalsapplication.app.modules.biriyani.`data`.model.BiriyaniRowModel
import kotlin.Int
import kotlin.collections.List

class BiriyaniAdapter(
  var list: List<BiriyaniRowModel>
) : RecyclerView.Adapter<BiriyaniAdapter.RowBiriyaniVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBiriyaniVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_biriyani,parent,false)
    return RowBiriyaniVH(view)
  }

  override fun onBindViewHolder(holder: RowBiriyaniVH, position: Int) {
    val biriyaniRowModel = BiriyaniRowModel()
    // TODO uncomment following line after integration with data source
    // val biriyaniRowModel = list[position]
    holder.binding.biriyaniRowModel = biriyaniRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BiriyaniRowModel>) {
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
      item: BiriyaniRowModel
    ) {
    }
  }

  inner class RowBiriyaniVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBiriyaniBinding = RowBiriyaniBinding.bind(itemView)
  }
}
