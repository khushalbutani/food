package com.khushalsapplication.app.modules.tteokbokki.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowTteokbokkiBinding
import com.khushalsapplication.app.modules.tteokbokki.`data`.model.TteokbokkiRowModel
import kotlin.Int
import kotlin.collections.List

class TteokbokkiAdapter(
  var list: List<TteokbokkiRowModel>
) : RecyclerView.Adapter<TteokbokkiAdapter.RowTteokbokkiVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTteokbokkiVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_tteokbokki,parent,false)
    return RowTteokbokkiVH(view)
  }

  override fun onBindViewHolder(holder: RowTteokbokkiVH, position: Int) {
    val tteokbokkiRowModel = TteokbokkiRowModel()
    // TODO uncomment following line after integration with data source
    // val tteokbokkiRowModel = list[position]
    holder.binding.tteokbokkiRowModel = tteokbokkiRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TteokbokkiRowModel>) {
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
      item: TteokbokkiRowModel
    ) {
    }
  }

  inner class RowTteokbokkiVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTteokbokkiBinding = RowTteokbokkiBinding.bind(itemView)
  }
}
