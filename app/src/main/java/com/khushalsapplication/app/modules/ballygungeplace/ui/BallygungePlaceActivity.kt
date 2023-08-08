package com.khushalsapplication.app.modules.ballygungeplace.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBallygungePlaceBinding
import com.khushalsapplication.app.modules.ballygungeplace.`data`.viewmodel.BallygungePlaceVM
import kotlin.String
import kotlin.Unit

class BallygungePlaceActivity :
    BaseActivity<ActivityBallygungePlaceBinding>(R.layout.activity_ballygunge_place) {
  private val viewModel: BallygungePlaceVM by viewModels<BallygungePlaceVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.ballygungePlaceVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BALLYGUNGE_PLACE_ACTIVITY"

  }
}
