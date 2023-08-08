package com.khushalsapplication.app.modules.brooksmotor.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityBrooksMotorBinding
import com.khushalsapplication.app.modules.brooksmotor.`data`.viewmodel.BrooksMotorVM
import kotlin.String
import kotlin.Unit

class BrooksMotorActivity : BaseActivity<ActivityBrooksMotorBinding>(R.layout.activity_brooks_motor)
    {
  private val viewModel: BrooksMotorVM by viewModels<BrooksMotorVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.brooksMotorVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "BROOKS_MOTOR_ACTIVITY"

  }
}
