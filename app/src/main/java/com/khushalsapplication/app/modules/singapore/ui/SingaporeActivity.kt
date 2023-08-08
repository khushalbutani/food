package com.khushalsapplication.app.modules.singapore.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySingaporeBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.singapore.`data`.model.SingaporeRowModel
import com.khushalsapplication.app.modules.singapore.`data`.viewmodel.SingaporeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SingaporeActivity : BaseActivity<ActivitySingaporeBinding>(R.layout.activity_singapore) {
  private val viewModel: SingaporeVM by viewModels<SingaporeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val singaporeAdapter = SingaporeAdapter(viewModel.singaporeList.value?:mutableListOf())
    binding.recyclerSingapore.adapter = singaporeAdapter
    singaporeAdapter.setOnItemClickListener(
    object : SingaporeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SingaporeRowModel) {
        onClickRecyclerSingapore(view, position, item)
      }
    }
    )
    viewModel.singaporeList.observe(this) {
      singaporeAdapter.updateData(it)
    }
    binding.singaporeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleSeventySeven.setOnClickListener {
      val destIntent = CuisinesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtFilter.setOnClickListener {
      val destIntent = FilterActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSingapore(
    view: View,
    position: Int,
    item: SingaporeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SINGAPORE_ACTIVITY"

  }
}
