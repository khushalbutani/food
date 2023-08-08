package com.khushalsapplication.app.modules.localfood.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityLocalfoodBinding
import com.khushalsapplication.app.modules.localfood.`data`.viewmodel.LocalfoodVM
import kotlin.String
import kotlin.Unit

class LocalfoodActivity : BaseActivity<ActivityLocalfoodBinding>(R.layout.activity_localfood) {
  private val viewModel: LocalfoodVM by viewModels<LocalfoodVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.localfoodVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOCALFOOD_ACTIVITY"

  }
}
