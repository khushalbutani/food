package com.khushalsapplication.app.modules.thai.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityThaiBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.thai.`data`.model.ThaiRowModel
import com.khushalsapplication.app.modules.thai.`data`.viewmodel.ThaiVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ThaiActivity : BaseActivity<ActivityThaiBinding>(R.layout.activity_thai) {
  private val viewModel: ThaiVM by viewModels<ThaiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val thaiAdapter = ThaiAdapter(viewModel.thaiList.value?:mutableListOf())
    binding.recyclerThai.adapter = thaiAdapter
    thaiAdapter.setOnItemClickListener(
    object : ThaiAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ThaiRowModel) {
        onClickRecyclerThai(view, position, item)
      }
    }
    )
    viewModel.thaiList.observe(this) {
      thaiAdapter.updateData(it)
    }
    binding.thaiVM = viewModel
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

  fun onClickRecyclerThai(
    view: View,
    position: Int,
    item: ThaiRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "THAI_ACTIVITY"

  }
}
