package com.khushalsapplication.app.modules.introthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityIntroThreeBinding
import com.khushalsapplication.app.modules.introthree.`data`.viewmodel.IntroThreeVM
import kotlin.String
import kotlin.Unit

class IntroThreeActivity : BaseActivity<ActivityIntroThreeBinding>(R.layout.activity_intro_three) {
  private val viewModel: IntroThreeVM by viewModels<IntroThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.introThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INTRO_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, IntroThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
