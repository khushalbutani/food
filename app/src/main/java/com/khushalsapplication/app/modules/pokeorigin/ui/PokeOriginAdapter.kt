package com.khushalsapplication.app.modules.pokeorigin.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPokeOriginBinding
import com.khushalsapplication.app.modules.pokeorigin.`data`.model.PokeOriginRowModel
import kotlin.Int
import kotlin.collections.List

class PokeOriginAdapter(
  var list: List<PokeOriginRowModel>
) : RecyclerView.Adapter<PokeOriginAdapter.RowPokeOriginVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPokeOriginVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_poke_origin,parent,false)
    return RowPokeOriginVH(view)
  }

  override fun onBindViewHolder(holder: RowPokeOriginVH, position: Int) {
    val pokeOriginRowModel = PokeOriginRowModel()
    // TODO uncomment following line after integration with data source
    // val pokeOriginRowModel = list[position]
    holder.binding.pokeOriginRowModel = pokeOriginRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PokeOriginRowModel>) {
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
      item: PokeOriginRowModel
    ) {
    }
  }

  inner class RowPokeOriginVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPokeOriginBinding = RowPokeOriginBinding.bind(itemView)
  }
}
