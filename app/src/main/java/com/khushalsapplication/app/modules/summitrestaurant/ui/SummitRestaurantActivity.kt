package com.khushalsapplication.app.modules.summitrestaurant.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivitySummitRestaurantBinding
import com.khushalsapplication.app.modules.summitrestaurant.`data`.viewmodel.SummitRestaurantVM
import kotlin.String
import kotlin.Unit

class SummitRestaurantActivity :
    BaseActivity<ActivitySummitRestaurantBinding>(R.layout.activity_summit_restaurant) {
  private val viewModel: SummitRestaurantVM by viewModels<SummitRestaurantVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.summitRestaurantVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SUMMIT_RESTAURANT_ACTIVITY"

  }
}
