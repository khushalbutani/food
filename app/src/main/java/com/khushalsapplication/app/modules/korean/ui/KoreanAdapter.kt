package com.khushalsapplication.app.modules.korean.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowKoreanBinding
import com.khushalsapplication.app.modules.korean.`data`.model.KoreanRowModel
import kotlin.Int
import kotlin.collections.List

class KoreanAdapter(
  var list: List<KoreanRowModel>
) : RecyclerView.Adapter<KoreanAdapter.RowKoreanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowKoreanVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_korean,parent,false)
    return RowKoreanVH(view)
  }

  override fun onBindViewHolder(holder: RowKoreanVH, position: Int) {
    val koreanRowModel = KoreanRowModel()
    // TODO uncomment following line after integration with data source
    // val koreanRowModel = list[position]
    holder.binding.koreanRowModel = koreanRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<KoreanRowModel>) {
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
      item: KoreanRowModel
    ) {
    }
  }

  inner class RowKoreanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowKoreanBinding = RowKoreanBinding.bind(itemView)
  }
}
