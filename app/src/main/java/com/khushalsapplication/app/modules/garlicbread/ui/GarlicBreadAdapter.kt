package com.khushalsapplication.app.modules.garlicbread.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowGarlicBreadBinding
import com.khushalsapplication.app.modules.garlicbread.`data`.model.GarlicBreadRowModel
import kotlin.Int
import kotlin.collections.List

class GarlicBreadAdapter(
  var list: List<GarlicBreadRowModel>
) : RecyclerView.Adapter<GarlicBreadAdapter.RowGarlicBreadVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGarlicBreadVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_garlic_bread,parent,false)
    return RowGarlicBreadVH(view)
  }

  override fun onBindViewHolder(holder: RowGarlicBreadVH, position: Int) {
    val garlicBreadRowModel = GarlicBreadRowModel()
    // TODO uncomment following line after integration with data source
    // val garlicBreadRowModel = list[position]
    holder.binding.garlicBreadRowModel = garlicBreadRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<GarlicBreadRowModel>) {
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
      item: GarlicBreadRowModel
    ) {
    }
  }

  inner class RowGarlicBreadVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGarlicBreadBinding = RowGarlicBreadBinding.bind(itemView)
  }
}
