package com.khushalsapplication.app.modules.trendingthisweek.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListrectangle151Binding
import com.khushalsapplication.app.modules.trendingthisweek.`data`.model.Listrectangle151RowModel
import kotlin.Int
import kotlin.collections.List

class Listrectangle151Adapter(
  var list: List<Listrectangle151RowModel>
) : RecyclerView.Adapter<Listrectangle151Adapter.RowListrectangle151VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangle151VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangle151,parent,false)
    return RowListrectangle151VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangle151VH, position: Int) {
    val listrectangle151RowModel = Listrectangle151RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangle151RowModel = list[position]
    holder.binding.listrectangle151RowModel = listrectangle151RowModel
  }

  override fun getItemCount(): Int = 12
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectangle151RowModel>) {
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
      item: Listrectangle151RowModel
    ) {
    }
  }

  inner class RowListrectangle151VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangle151Binding = RowListrectangle151Binding.bind(itemView)
    init {
      binding.imageRectangle117.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectangle151RowModel())
      }
      binding.linearRowrectangle151.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectangle151RowModel())
      }
    }
  }
}
