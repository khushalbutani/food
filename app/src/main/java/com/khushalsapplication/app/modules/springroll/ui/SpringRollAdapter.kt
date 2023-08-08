package com.khushalsapplication.app.modules.springroll.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowSpringRollBinding
import com.khushalsapplication.app.modules.springroll.`data`.model.SpringRollRowModel
import kotlin.Int
import kotlin.collections.List

class SpringRollAdapter(
  var list: List<SpringRollRowModel>
) : RecyclerView.Adapter<SpringRollAdapter.RowSpringRollVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSpringRollVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_spring_roll,parent,false)
    return RowSpringRollVH(view)
  }

  override fun onBindViewHolder(holder: RowSpringRollVH, position: Int) {
    val springRollRowModel = SpringRollRowModel()
    // TODO uncomment following line after integration with data source
    // val springRollRowModel = list[position]
    holder.binding.springRollRowModel = springRollRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SpringRollRowModel>) {
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
      item: SpringRollRowModel
    ) {
    }
  }

  inner class RowSpringRollVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSpringRollBinding = RowSpringRollBinding.bind(itemView)
  }
}
