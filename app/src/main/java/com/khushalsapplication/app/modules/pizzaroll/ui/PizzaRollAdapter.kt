package com.khushalsapplication.app.modules.pizzaroll.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowPizzaRollBinding
import com.khushalsapplication.app.modules.pizzaroll.`data`.model.PizzaRollRowModel
import kotlin.Int
import kotlin.collections.List

class PizzaRollAdapter(
  var list: List<PizzaRollRowModel>
) : RecyclerView.Adapter<PizzaRollAdapter.RowPizzaRollVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPizzaRollVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pizza_roll,parent,false)
    return RowPizzaRollVH(view)
  }

  override fun onBindViewHolder(holder: RowPizzaRollVH, position: Int) {
    val pizzaRollRowModel = PizzaRollRowModel()
    // TODO uncomment following line after integration with data source
    // val pizzaRollRowModel = list[position]
    holder.binding.pizzaRollRowModel = pizzaRollRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PizzaRollRowModel>) {
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
      item: PizzaRollRowModel
    ) {
    }
  }

  inner class RowPizzaRollVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPizzaRollBinding = RowPizzaRollBinding.bind(itemView)
  }
}
