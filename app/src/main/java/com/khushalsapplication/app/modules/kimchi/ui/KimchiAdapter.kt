package com.khushalsapplication.app.modules.kimchi.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowKimchiBinding
import com.khushalsapplication.app.modules.kimchi.`data`.model.KimchiRowModel
import kotlin.Int
import kotlin.collections.List

class KimchiAdapter(
  var list: List<KimchiRowModel>
) : RecyclerView.Adapter<KimchiAdapter.RowKimchiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKimchiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_kimchi,parent,false)
    return RowKimchiVH(view)
  }

  override fun onBindViewHolder(holder: RowKimchiVH, position: Int) {
    val kimchiRowModel = KimchiRowModel()
    // TODO uncomment following line after integration with data source
    // val kimchiRowModel = list[position]
    holder.binding.kimchiRowModel = kimchiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KimchiRowModel>) {
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
      item: KimchiRowModel
    ) {
    }
  }

  inner class RowKimchiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKimchiBinding = RowKimchiBinding.bind(itemView)
  }
}
