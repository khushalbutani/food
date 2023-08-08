package com.khushalsapplication.app.modules.natillareceta.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowNatillaRecetaBinding
import com.khushalsapplication.app.modules.natillareceta.`data`.model.NatillaRecetaRowModel
import kotlin.Int
import kotlin.collections.List

class NatillaRecetaAdapter(
  var list: List<NatillaRecetaRowModel>
) : RecyclerView.Adapter<NatillaRecetaAdapter.RowNatillaRecetaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNatillaRecetaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_natilla_receta,parent,false)
    return RowNatillaRecetaVH(view)
  }

  override fun onBindViewHolder(holder: RowNatillaRecetaVH, position: Int) {
    val natillaRecetaRowModel = NatillaRecetaRowModel()
    // TODO uncomment following line after integration with data source
    // val natillaRecetaRowModel = list[position]
    holder.binding.natillaRecetaRowModel = natillaRecetaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NatillaRecetaRowModel>) {
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
      item: NatillaRecetaRowModel
    ) {
    }
  }

  inner class RowNatillaRecetaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNatillaRecetaBinding = RowNatillaRecetaBinding.bind(itemView)
  }
}
