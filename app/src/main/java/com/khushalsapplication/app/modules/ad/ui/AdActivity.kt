package com.khushalsapplication.app.modules.ad.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAdBinding
import com.khushalsapplication.app.modules.ad.`data`.viewmodel.AdVM
import kotlin.String
import kotlin.Unit

class AdActivity : BaseActivity<ActivityAdBinding>(R.layout.activity_ad) {
  private val viewModel: AdVM by viewModels<AdVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.adVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AD_ACTIVITY"

  }
}
