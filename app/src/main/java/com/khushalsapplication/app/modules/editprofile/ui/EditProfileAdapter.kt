package com.khushalsapplication.app.modules.editprofile.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.khushalsapplication.app.R
import com.khushalsapplication.app.databinding.RowEditProfileBinding
import com.khushalsapplication.app.modules.editprofile.`data`.model.EditProfileRowModel
import kotlin.Int
import kotlin.collections.List

class EditProfileAdapter(
  var list: List<EditProfileRowModel>
) : RecyclerView.Adapter<EditProfileAdapter.RowEditProfileVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowEditProfileVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_edit_profile,parent,false)
    return RowEditProfileVH(view)
  }

  override fun onBindViewHolder(holder: RowEditProfileVH, position: Int) {
    val editProfileRowModel = EditProfileRowModel()
    // TODO uncomment following line after integration with data source
    // val editProfileRowModel = list[position]
    holder.binding.editProfileRowModel = editProfileRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<EditProfileRowModel>) {
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
      item: EditProfileRowModel
    ) {
    }
  }

  inner class RowEditProfileVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowEditProfileBinding = RowEditProfileBinding.bind(itemView)
  }
}
