package com.khushalsapplication.app.modules.starbuks.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityStarbuksBinding
import com.khushalsapplication.app.modules.starbuks.`data`.viewmodel.StarbuksVM
import kotlin.String
import kotlin.Unit

class StarbuksActivity : BaseActivity<ActivityStarbuksBinding>(R.layout.activity_starbuks) {
  private val viewModel: StarbuksVM by viewModels<StarbuksVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.starbuksVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "STARBUKS_ACTIVITY"

  }
}
