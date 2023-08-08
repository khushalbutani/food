package com.khushalsapplication.app.modules.collections.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowCollectionsBinding
import com.khushalsapplication.app.modules.collections.`data`.model.CollectionsRowModel
import kotlin.Int
import kotlin.collections.List

class CollectionsAdapter(
  var list: List<CollectionsRowModel>
) : RecyclerView.Adapter<CollectionsAdapter.RowCollectionsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCollectionsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_collections,parent,false)
    return RowCollectionsVH(view)
  }

  override fun onBindViewHolder(holder: RowCollectionsVH, position: Int) {
    val collectionsRowModel = CollectionsRowModel()
    // TODO uncomment following line after integration with data source
    // val collectionsRowModel = list[position]
    holder.binding.collectionsRowModel = collectionsRowModel
  }

  override fun getItemCount(): Int = 15
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CollectionsRowModel>) {
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
      item: CollectionsRowModel
    ) {
    }
  }

  inner class RowCollectionsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCollectionsBinding = RowCollectionsBinding.bind(itemView)
  }
}
