package com.khushalsapplication.app.modules.amethyst.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAmethystBinding
import com.khushalsapplication.app.modules.amethyst.`data`.viewmodel.AmethystVM
import kotlin.String
import kotlin.Unit

class AmethystActivity : BaseActivity<ActivityAmethystBinding>(R.layout.activity_amethyst) {
  private val viewModel: AmethystVM by viewModels<AmethystVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.amethystVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AMETHYST_ACTIVITY"

  }
}
