package com.khushalsapplication.app.modules.nigirisushi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowNigiriSushiBinding
import com.khushalsapplication.app.modules.nigirisushi.`data`.model.NigiriSushiRowModel
import kotlin.Int
import kotlin.collections.List

class NigiriSushiAdapter(
  var list: List<NigiriSushiRowModel>
) : RecyclerView.Adapter<NigiriSushiAdapter.RowNigiriSushiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNigiriSushiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_nigiri_sushi,parent,false)
    return RowNigiriSushiVH(view)
  }

  override fun onBindViewHolder(holder: RowNigiriSushiVH, position: Int) {
    val nigiriSushiRowModel = NigiriSushiRowModel()
    // TODO uncomment following line after integration with data source
    // val nigiriSushiRowModel = list[position]
    holder.binding.nigiriSushiRowModel = nigiriSushiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NigiriSushiRowModel>) {
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
      item: NigiriSushiRowModel
    ) {
    }
  }

  inner class RowNigiriSushiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNigiriSushiBinding = RowNigiriSushiBinding.bind(itemView)
  }
}
