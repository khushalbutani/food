package com.khushalsapplication.app.modules.onioncheese.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityOnionCheeseBinding
import com.khushalsapplication.app.modules.onioncheese.`data`.model.OnionCheeseRowModel
import com.khushalsapplication.app.modules.onioncheese.`data`.viewmodel.OnionCheeseVM
import com.khushalsapplication.app.modules.trendingthisweek.ui.TrendingThisWeekActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class OnionCheeseActivity : BaseActivity<ActivityOnionCheeseBinding>(R.layout.activity_onion_cheese)
    {
  private val viewModel: OnionCheeseVM by viewModels<OnionCheeseVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val onionCheeseAdapter =
    OnionCheeseAdapter(viewModel.onionCheeseList.value?:mutableListOf())
    binding.recyclerOnionCheese.adapter = onionCheeseAdapter
    onionCheeseAdapter.setOnItemClickListener(
    object : OnionCheeseAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : OnionCheeseRowModel) {
        onClickRecyclerOnionCheese(view, position, item)
      }
    }
    )
    viewModel.onionCheeseList.observe(this) {
      onionCheeseAdapter.updateData(it)
    }
    binding.onionCheeseVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangle294.setOnClickListener {
      val destIntent = TrendingThisWeekActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerOnionCheese(
    view: View,
    position: Int,
    item: OnionCheeseRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ONION_CHEESE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, OnionCheeseActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
