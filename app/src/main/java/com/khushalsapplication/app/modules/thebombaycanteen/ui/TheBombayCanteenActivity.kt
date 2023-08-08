package com.khushalsapplication.app.modules.thebombaycanteen.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityTheBombayCanteenBinding
import com.khushalsapplication.app.modules.thebombaycanteen.`data`.viewmodel.TheBombayCanteenVM
import kotlin.String
import kotlin.Unit

class TheBombayCanteenActivity :
    BaseActivity<ActivityTheBombayCanteenBinding>(R.layout.activity_the_bombay_canteen) {
  private val viewModel: TheBombayCanteenVM by viewModels<TheBombayCanteenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.theBombayCanteenVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "THE_BOMBAY_CANTEEN_ACTIVITY"

  }
}
