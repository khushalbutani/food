package com.khushalsapplication.app.modules.sliders.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySlidersBinding
import com.khushalsapplication.app.modules.sliders.`data`.model.SlidersRowModel
import com.khushalsapplication.app.modules.sliders.`data`.viewmodel.SlidersVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SlidersActivity : BaseActivity<ActivitySlidersBinding>(R.layout.activity_sliders) {
  private val viewModel: SlidersVM by viewModels<SlidersVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val slidersAdapter = SlidersAdapter(viewModel.slidersList.value?:mutableListOf())
    binding.recyclerSliders.adapter = slidersAdapter
    slidersAdapter.setOnItemClickListener(
    object : SlidersAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SlidersRowModel) {
        onClickRecyclerSliders(view, position, item)
      }
    }
    )
    viewModel.slidersList.observe(this) {
      slidersAdapter.updateData(it)
    }
    binding.slidersVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerSliders(
    view: View,
    position: Int,
    item: SlidersRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SLIDERS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SlidersActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
