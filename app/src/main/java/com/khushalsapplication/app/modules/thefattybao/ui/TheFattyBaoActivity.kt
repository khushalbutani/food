package com.khushalsapplication.app.modules.thefattybao.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTheFattyBaoBinding
import com.khushalsapplication.app.modules.thefattybao.`data`.viewmodel.TheFattyBaoVM
import kotlin.String
import kotlin.Unit

class TheFattyBaoActivity :
    BaseActivity<ActivityTheFattyBaoBinding>(R.layout.activity_the_fatty_bao) {
  private val viewModel: TheFattyBaoVM by viewModels<TheFattyBaoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.theFattyBaoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "THE_FATTY_BAO_ACTIVITY"

  }
}
