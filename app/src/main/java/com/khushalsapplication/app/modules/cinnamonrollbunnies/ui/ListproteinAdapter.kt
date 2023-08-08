package com.khushalsapplication.app.modules.cinnamonrollbunnies.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListprotein2Binding
import com.khushalsapplication.app.modules.cinnamonrollbunnies.`data`.model.Listprotein2RowModel
import kotlin.Int
import kotlin.collections.List

class ListproteinAdapter(
  var list: List<Listprotein2RowModel>
) : RecyclerView.Adapter<ListproteinAdapter.RowListprotein2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListprotein2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listprotein2,parent,false)
    return RowListprotein2VH(view)
  }

  override fun onBindViewHolder(holder: RowListprotein2VH, position: Int) {
    val listprotein2RowModel = Listprotein2RowModel()
    // TODO uncomment following line after integration with data source
    // val listprotein2RowModel = list[position]
    holder.binding.listprotein2RowModel = listprotein2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listprotein2RowModel>) {
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
      item: Listprotein2RowModel
    ) {
    }
  }

  inner class RowListprotein2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListprotein2Binding = RowListprotein2Binding.bind(itemView)
  }
}
