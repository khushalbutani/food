package com.khushalsapplication.app.modules.browse.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowListbigdoubleBinding
import com.khushalsapplication.app.modules.browse.`data`.model.ListbigdoubleRowModel
import kotlin.Int
import kotlin.collections.List

class ListbigdoubleAdapter(
  var list: List<ListbigdoubleRowModel>
) : RecyclerView.Adapter<ListbigdoubleAdapter.RowListbigdoubleVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListbigdoubleVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listbigdouble,parent,false)
    return RowListbigdoubleVH(view)
  }

  override fun onBindViewHolder(holder: RowListbigdoubleVH, position: Int) {
    val listbigdoubleRowModel = ListbigdoubleRowModel()
    // TODO uncomment following line after integration with data source
    // val listbigdoubleRowModel = list[position]
    holder.binding.listbigdoubleRowModel = listbigdoubleRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListbigdoubleRowModel>) {
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
      item: ListbigdoubleRowModel
    ) {
    }
  }

  inner class RowListbigdoubleVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListbigdoubleBinding = RowListbigdoubleBinding.bind(itemView)
  }
}
