package com.khushalsapplication.app.modules.mexican.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowMexicanBinding
import com.khushalsapplication.app.modules.mexican.`data`.model.MexicanRowModel
import kotlin.Int
import kotlin.collections.List

class MexicanAdapter(
  var list: List<MexicanRowModel>
) : RecyclerView.Adapter<MexicanAdapter.RowMexicanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMexicanVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_mexican,parent,false)
    return RowMexicanVH(view)
  }

  override fun onBindViewHolder(holder: RowMexicanVH, position: Int) {
    val mexicanRowModel = MexicanRowModel()
    // TODO uncomment following line after integration with data source
    // val mexicanRowModel = list[position]
    holder.binding.mexicanRowModel = mexicanRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MexicanRowModel>) {
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
      item: MexicanRowModel
    ) {
    }
  }

  inner class RowMexicanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMexicanBinding = RowMexicanBinding.bind(itemView)
  }
}
