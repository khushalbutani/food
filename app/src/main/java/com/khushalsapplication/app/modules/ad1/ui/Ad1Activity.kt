package com.khushalsapplication.app.modules.ad1.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityAd1Binding
import com.khushalsapplication.app.modules.ad1.`data`.viewmodel.Ad1VM
import kotlin.String
import kotlin.Unit

class Ad1Activity : BaseActivity<ActivityAd1Binding>(R.layout.activity_ad1) {
  private val viewModel: Ad1VM by viewModels<Ad1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ad1VM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "AD1ACTIVITY"

  }
}
