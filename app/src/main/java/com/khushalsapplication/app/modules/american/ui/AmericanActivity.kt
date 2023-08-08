package com.khushalsapplication.app.modules.american.ui

import android.view.View
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAmericanBinding
import com.khushalsapplication.app.modules.american.`data`.model.AmericanRowModel
import com.khushalsapplication.app.modules.american.`data`.viewmodel.AmericanVM
import com.khushalsapplication.app.modules.cuisines.ui.CuisinesActivity
import com.khushalsapplication.app.modules.filter.ui.FilterActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AmericanActivity : BaseActivity<ActivityAmericanBinding>(R.layout.activity_american) {
  private val viewModel: AmericanVM by viewModels<AmericanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val americanAdapter = AmericanAdapter(viewModel.americanList.value?:mutableListOf())
    binding.recyclerAmerican.adapter = americanAdapter
    americanAdapter.setOnItemClickListener(
    object : AmericanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AmericanRowModel) {
        onClickRecyclerAmerican(view, position, item)
      }
    }
    )
    viewModel.americanList.observe(this) {
      americanAdapter.updateData(it)
    }
    binding.americanVM = viewModel
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

  fun onClickRecyclerAmerican(
    view: View,
    position: Int,
    item: AmericanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "AMERICAN_ACTIVITY"

  }
}
