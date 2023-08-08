package com.khushalsapplication.app.modules.korean.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityKoreanBinding
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import com.khushalsapplication.app.modules.korean.`data`.model.KoreanRowModel
import com.khushalsapplication.app.modules.korean.`data`.viewmodel.KoreanVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class KoreanActivity : BaseActivity<ActivityKoreanBinding>(R.layout.activity_korean) {
  private val viewModel: KoreanVM by viewModels<KoreanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val koreanAdapter = KoreanAdapter(viewModel.koreanList.value?:mutableListOf())
    binding.recyclerKorean.adapter = koreanAdapter
    koreanAdapter.setOnItemClickListener(
    object : KoreanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : KoreanRowModel) {
        onClickRecyclerKorean(view, position, item)
      }
    }
    )
    viewModel.koreanList.observe(this) {
      koreanAdapter.updateData(it)
    }
    binding.koreanVM = viewModel
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

  fun onClickRecyclerKorean(
    view: View,
    position: Int,
    item: KoreanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "KOREAN_ACTIVITY"

  }
}
