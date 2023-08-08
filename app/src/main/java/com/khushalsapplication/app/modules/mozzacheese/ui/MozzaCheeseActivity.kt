package com.khushalsapplication.app.modules.mozzacheese.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityMozzaCheeseBinding
import com.khushalsapplication.app.modules.mozzacheese.`data`.model.MozzaCheeseRowModel
import com.khushalsapplication.app.modules.mozzacheese.`data`.viewmodel.MozzaCheeseVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MozzaCheeseActivity : BaseActivity<ActivityMozzaCheeseBinding>(R.layout.activity_mozza_cheese)
    {
  private val viewModel: MozzaCheeseVM by viewModels<MozzaCheeseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val mozzaCheeseAdapter =
    MozzaCheeseAdapter(viewModel.mozzaCheeseList.value?:mutableListOf())
    binding.recyclerMozzaCheese.adapter = mozzaCheeseAdapter
    mozzaCheeseAdapter.setOnItemClickListener(
    object : MozzaCheeseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : MozzaCheeseRowModel) {
        onClickRecyclerMozzaCheese(view, position, item)
      }
    }
    )
    viewModel.mozzaCheeseList.observe(this) {
      mozzaCheeseAdapter.updateData(it)
    }
    binding.mozzaCheeseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerMozzaCheese(
    view: View,
    position: Int,
    item: MozzaCheeseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MOZZA_CHEESE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MozzaCheeseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
