package com.khushalsapplication.app.modules.introtwo.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIntroTwoBinding
import com.khushalsapplication.app.modules.introthree.ui.IntroThreeActivity
import com.khushalsapplication.app.modules.introtwo.`data`.viewmodel.IntroTwoVM
import kotlin.String
import kotlin.Unit

class IntroTwoActivity : BaseActivity<ActivityIntroTwoBinding>(R.layout.activity_intro_two) {
  private val viewModel: IntroTwoVM by viewModels<IntroTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtSkip.setOnClickListener {
      val destIntent = IntroThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "INTRO_TWO_ACTIVITY"

  }
}
