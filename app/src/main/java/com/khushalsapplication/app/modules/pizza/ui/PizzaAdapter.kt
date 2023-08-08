package com.khushalsapplication.app.modules.pizza.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPizzaBinding
import com.khushalsapplication.app.modules.pizza.`data`.model.PizzaRowModel
import kotlin.Int
import kotlin.collections.List

class PizzaAdapter(
  var list: List<PizzaRowModel>
) : RecyclerView.Adapter<PizzaAdapter.RowPizzaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPizzaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pizza,parent,false)
    return RowPizzaVH(view)
  }

  override fun onBindViewHolder(holder: RowPizzaVH, position: Int) {
    val pizzaRowModel = PizzaRowModel()
    // TODO uncomment following line after integration with data source
    // val pizzaRowModel = list[position]
    holder.binding.pizzaRowModel = pizzaRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PizzaRowModel>) {
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
      item: PizzaRowModel
    ) {
    }
  }

  inner class RowPizzaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPizzaBinding = RowPizzaBinding.bind(itemView)
  }
}
