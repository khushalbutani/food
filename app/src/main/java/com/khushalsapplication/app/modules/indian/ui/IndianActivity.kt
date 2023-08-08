package com.khushalsapplication.app.modules.indian.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIndianBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.indian.`data`.model.IndianRowModel
import com.khushalsapplication.app.modules.indian.`data`.viewmodel.IndianVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class IndianActivity : BaseActivity<ActivityIndianBinding>(R.layout.activity_indian) {
  private val viewModel: IndianVM by viewModels<IndianVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val indianAdapter = IndianAdapter(viewModel.indianList.value?:mutableListOf())
    binding.recyclerIndian.adapter = indianAdapter
    indianAdapter.setOnItemClickListener(
    object : IndianAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IndianRowModel) {
        onClickRecyclerIndian(view, position, item)
      }
    }
    )
    viewModel.indianList.observe(this) {
      indianAdapter.updateData(it)
    }
    binding.indianVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleSeventySeven.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerIndian(
    view: View,
    position: Int,
    item: IndianRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INDIAN_ACTIVITY"

  }
}
