package com.khushalsapplication.app.modules.chinese.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityChineseBinding
import com.khushalsapplication.app.modules.chinese.`data`.model.ChineseRowModel
import com.khushalsapplication.app.modules.chinese.`data`.viewmodel.ChineseVM
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ChineseActivity : BaseActivity<ActivityChineseBinding>(R.layout.activity_chinese) {
  private val viewModel: ChineseVM by viewModels<ChineseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val chineseAdapter = ChineseAdapter(viewModel.chineseList.value?:mutableListOf())
    binding.recyclerChinese.adapter = chineseAdapter
    chineseAdapter.setOnItemClickListener(
    object : ChineseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ChineseRowModel) {
        onClickRecyclerChinese(view, position, item)
      }
    }
    )
    viewModel.chineseList.observe(this) {
      chineseAdapter.updateData(it)
    }
    binding.chineseVM = viewModel
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

  fun onClickRecyclerChinese(
    view: View,
    position: Int,
    item: ChineseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CHINESE_ACTIVITY"

  }
}
