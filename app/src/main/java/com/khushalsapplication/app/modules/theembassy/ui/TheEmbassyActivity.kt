package com.khushalsapplication.app.modules.theembassy.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTheEmbassyBinding
import com.khushalsapplication.app.modules.theembassy.`data`.viewmodel.TheEmbassyVM
import kotlin.String
import kotlin.Unit

class TheEmbassyActivity : BaseActivity<ActivityTheEmbassyBinding>(R.layout.activity_the_embassy) {
  private val viewModel: TheEmbassyVM by viewModels<TheEmbassyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.theEmbassyVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "THE_EMBASSY_ACTIVITY"

  }
}
