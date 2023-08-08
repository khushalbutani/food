package com.khushalsapplication.app.modules.riverbamboo.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityRiverBambooBinding
import com.khushalsapplication.app.modules.riverbamboo.`data`.viewmodel.RiverBambooVM
import kotlin.String
import kotlin.Unit

class RiverBambooActivity : BaseActivity<ActivityRiverBambooBinding>(R.layout.activity_river_bamboo)
    {
  private val viewModel: RiverBambooVM by viewModels<RiverBambooVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.riverBambooVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "RIVER_BAMBOO_ACTIVITY"

  }
}
