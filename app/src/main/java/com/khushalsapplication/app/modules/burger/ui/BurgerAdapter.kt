package com.khushalsapplication.app.modules.burger.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowBurgerBinding
import com.khushalsapplication.app.modules.burger.`data`.model.BurgerRowModel
import kotlin.Int
import kotlin.collections.List

class BurgerAdapter(
  var list: List<BurgerRowModel>
) : RecyclerView.Adapter<BurgerAdapter.RowBurgerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowBurgerVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_burger,parent,false)
    return RowBurgerVH(view)
  }

  override fun onBindViewHolder(holder: RowBurgerVH, position: Int) {
    val burgerRowModel = BurgerRowModel()
    // TODO uncomment following line after integration with data source
    // val burgerRowModel = list[position]
    holder.binding.burgerRowModel = burgerRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<BurgerRowModel>) {
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
      item: BurgerRowModel
    ) {
    }
  }

  inner class RowBurgerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowBurgerBinding = RowBurgerBinding.bind(itemView)
  }
}
