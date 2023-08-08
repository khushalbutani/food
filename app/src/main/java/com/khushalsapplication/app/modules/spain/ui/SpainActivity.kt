package com.khushalsapplication.app.modules.spain.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySpainBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.spain.`data`.model.SpainRowModel
import com.khushalsapplication.app.modules.spain.`data`.viewmodel.SpainVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SpainActivity : BaseActivity<ActivitySpainBinding>(R.layout.activity_spain) {
  private val viewModel: SpainVM by viewModels<SpainVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val spainAdapter = SpainAdapter(viewModel.spainList.value?:mutableListOf())
    binding.recyclerSpain.adapter = spainAdapter
    spainAdapter.setOnItemClickListener(
    object : SpainAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SpainRowModel) {
        onClickRecyclerSpain(view, position, item)
      }
    }
    )
    viewModel.spainList.observe(this) {
      spainAdapter.updateData(it)
    }
    binding.spainVM = viewModel
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

  fun onClickRecyclerSpain(
    view: View,
    position: Int,
    item: SpainRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SPAIN_ACTIVITY"

  }
}
