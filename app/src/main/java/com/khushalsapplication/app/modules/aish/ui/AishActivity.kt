package com.khushalsapplication.app.modules.aish.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAishBinding
import com.khushalsapplication.app.modules.aish.`data`.viewmodel.AishVM
import kotlin.String
import kotlin.Unit

class AishActivity : BaseActivity<ActivityAishBinding>(R.layout.activity_aish) {
  private val viewModel: AishVM by viewModels<AishVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.aishVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AISH_ACTIVITY"

  }
}
