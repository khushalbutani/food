package com.khushalsapplication.app.modules.nearby.ui

import androidx.activity.viewModels
import com.khushalsapplication.app.R
import com.khushalsapplication.app.appcomponents.base.BaseActivity
import com.khushalsapplication.app.databinding.ActivityNearbyBinding
import com.khushalsapplication.app.modules.nearby.`data`.viewmodel.NearbyVM
import com.khushalsapplication.app.modules.order.ui.OrderActivity
import kotlin.String
import kotlin.Unit

class NearbyActivity : BaseActivity<ActivityNearbyBinding>(R.layout.activity_nearby) {
  private val viewModel: NearbyVM by viewModels<NearbyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nearbyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleNinetyFour.setOnClickListener {
      val destIntent = OrderActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NEARBY_ACTIVITY"

  }
}
