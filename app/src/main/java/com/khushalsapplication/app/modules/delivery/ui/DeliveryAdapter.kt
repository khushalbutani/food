package com.khushalsapplication.app.modules.delivery.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowDeliveryBinding
import com.khushalsapplication.app.modules.delivery.`data`.model.DeliveryRowModel
import kotlin.Int
import kotlin.collections.List

class DeliveryAdapter(
  var list: List<DeliveryRowModel>
) : RecyclerView.Adapter<DeliveryAdapter.RowDeliveryVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDeliveryVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_delivery,parent,false)
    return RowDeliveryVH(view)
  }

  override fun onBindViewHolder(holder: RowDeliveryVH, position: Int) {
    val deliveryRowModel = DeliveryRowModel()
    // TODO uncomment following line after integration with data source
    // val deliveryRowModel = list[position]
    holder.binding.deliveryRowModel = deliveryRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<DeliveryRowModel>) {
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
      item: DeliveryRowModel
    ) {
    }
  }

  inner class RowDeliveryVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowDeliveryBinding = RowDeliveryBinding.bind(itemView)
  }
}
